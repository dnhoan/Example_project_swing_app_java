package edusys.DAO;

import edusys.Service.DateService;
import edusys.Service.HelperService;
import edusys.model.Course;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class CourseDAO extends EduSysDAO<Course, Integer> {

    String SELECT_ALL = "SELECT * FROM KHOAHOC";
    String SELECT_BY_ID = "SELECT * FROM KHOAHOC WHERE MAKH = ?";
    String DELETE = "DELETE FROM KHOAHOC WHERE MAKH = ?";
    String UPDATE = "UPDATE KHOAHOC SET NGAYKG = ?,GHICHU = ? WHERE MAKH = ?";
    String INSERT = "INSERT INTO KHOAHOC(MACD,HOCPHI,THOILUONG,NGAYKG,GHICHU,MANV) VALUES(?,?,?,?,?,?)";
    String SELECT_BY_CHUYEN_DE = "SELECT * FROM KHOAHOC WHERE MACD = ?";
    String SELECT_YEARS = "SELECT DISTINCT YEAR(NGAYKG) YEARS FROM KHOAHOC ORDER BY  YEAR(NGAYKG) DESC";
    @Override
    public void insert(Course course) {
        try {
            HelperService.update(INSERT,
                    course.getMaCD(),
                    course.getHocPhi(),
                    course.getThoiLuong(),
                    course.getNgayKG(),
                    course.getGhiChu(),
                    course.getMaNV()
            );
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update(Course course) {
        System.out.println(course.getNgayKG()+
                course.getGhiChu()+
                course.getMaKH());
        try {
            HelperService.update(UPDATE,
                course.getNgayKG(),
                course.getGhiChu(),
                course.getMaKH()
        );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer makh) {
        try {
            HelperService.update(DELETE, makh);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public Course selectByID(Integer makh) {
        return this.selectBySql(SELECT_BY_ID, makh).get(0);
    }

    @Override
    public List<Course> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    @Override
    protected List<Course> selectBySql(String sql, Object... args) {
        List<Course> listCourses = new ArrayList<>();
        try {
            ResultSet resultSet = HelperService.query(sql, args);
            while(resultSet.next()) {
                Course course = new Course();
                course.setMaKH(resultSet.getInt("makh"));
                course.setMaCD(resultSet.getString("macd"));
                course.setHocPhi(resultSet.getFloat("hocphi"));
                course.setThoiLuong(resultSet.getInt("thoiluong"));
                course.setNgayKG(resultSet.getDate("ngaykg"));
                course.setGhiChu(resultSet.getString("ghichu"));
                course.setMaNV(resultSet.getString("manv"));
                course.setNgayTao(resultSet.getDate("ngaytao"));
                listCourses.add(course);
            }
            resultSet.getStatement().close();
            return listCourses;
        } catch (Exception e) {
            System.out.println("error select sql");
        }
        return null;
    }

    public List<Course> selectByThematic(String macd) {
        return this.selectBySql(SELECT_BY_CHUYEN_DE, macd);
    }
    
    public List<Integer> getYears() {
        List<Integer> years = new ArrayList<>();
        try {
            ResultSet resultSet = HelperService.query(SELECT_YEARS);
            while(resultSet.next()) {
                years.add(resultSet.getInt(1));
            }
            resultSet.getStatement().close();
            return years;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
