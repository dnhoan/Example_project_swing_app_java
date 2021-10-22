package DAO;

import Service.HelperService;
import Model.Student;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO extends EduSysDAO<Student, Integer> {

    String SELECT_ALL = "SELECT * FROM HOCVIEN WHERE MAKH = ?";
    String SELECT_BY_ID = "SELECT * FROM HOCVIEN WHERE MAHV = ?";
    String DELETE_STUDENT = "DELETE FROM HOCVIEN WHERE MAHV = ?";
    String INSERT_STUDENT = "INSERT INTO HOCVIEN (MAKH,MANH,DIEM)  VALUES (?,?,?)";
    String UPDATE_STUDENT = "UPDATE HOCVIEN SET DIEM = ? WHERE MAHV = ?";
    String CHECK_LEARNER_IN_STUDENT = "SELECT * FROM HOCVIEN WHERE  MANH = ?";

    @Override
    public void insert(Student student) {
        try {
            HelperService.update(INSERT_STUDENT,
                    student.getMaKH(),
                    student.getMaNH(),
                    student.getDiem()
            );
        } catch (Exception e) {
        }
    }

    @Override
    public void update(Student student) {
        try {
            HelperService.update(UPDATE_STUDENT,
                    student.getDiem(),
                    student.getMaHV()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Integer mahv) {
        try {
            HelperService.update(DELETE_STUDENT, mahv);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> selectStudentByCourse(int makh) {
        return this.selectBySql(SELECT_ALL, makh);
    }

    @Override
    protected List<Student> selectBySql(String sql, Object... args) {
        List<Student> studentsList = new ArrayList<>();
        try {
            ResultSet resultSet = HelperService.query(sql, args);
            while (resultSet.next()) {
                Student student = new Student();
                student.setMaHV(resultSet.getInt("mahv"));
                student.setMaKH(resultSet.getInt("makh"));
                student.setMaNH(resultSet.getString("manh"));
                student.setDiem(resultSet.getFloat("diem"));
                studentsList.add(student);
            }
            resultSet.getStatement().close();
            return studentsList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Student selectByID(Integer mahv) {
        return this.selectBySql(SELECT_BY_ID, mahv).get(0);
    }

    @Override
    public List<Student> selectAll() {
        return null;
    }
    
    public boolean isLeanerInStudent(String manh) {
         List<Student> studentsList = this.selectBySql(CHECK_LEARNER_IN_STUDENT, manh);
        return studentsList.size() > 0;
    }
}
