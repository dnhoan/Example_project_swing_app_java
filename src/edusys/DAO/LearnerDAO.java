
package edusys.DAO;
//  rename
import edusys.Service.HelperService;
import edusys.model.Learner;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LearnerDAO extends EduSysDAO<Learner, String>{
    String INSERT_SQL = "INSERT INTO NGUOIHOC(MANH,HOTEN,GIOITINH,NGAYSINH,DIENTHOAI,EMAIL,GHICHU,MANV) VALUES(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NGUOIHOC SET HOTEN = ?,GIOITINH = ?,NGAYSINH = ?,DIENTHOAI = ?,EMAIL = ?,GHICHU = ?,MANV = ? WHERE MANH = ?";
    String DELETE_SQL = "DELETE FROM NGUOIHOC WHERE MANH = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NGUOIHOC";
    String SELECT_BY_ID_SQL = "SELECT * FROM NGUOIHOC WHERE MANH = ?";
    String SEARCH_SQL = "SELECT * FROM NGUOIHOC WHERE HOTEN LIKE ?";
    String SELECT_LEARNERS_NOT_IN_COURSE = "SELECT * FROM NGUOIHOC \n" +
                            "WHERE HOTEN LIKE ? AND\n" +
                            "MANH NOT IN  (SELECT MANH FROM HOCVIEN WHERE MAKH = ?)";
    
    @Override
    public void insert(Learner learner) {
        try {
            HelperService.update(INSERT_SQL, 
                    learner.getMaNH(),
                    learner.getHoTen(),
                    learner.isGioiTinh(), 
                    learner.getNgaySinh(), 
                    learner.getDienThoai(), 
                    learner.getEmail(),
                    learner.getGhiChu(), 
                    learner.getMaNV()
            );
        } catch (SQLException e) {
        }
    }
    @Override
    public void delete(String manh) {
        try {
            HelperService.update(DELETE_SQL, manh);
        } catch (SQLException e) {
        }
    }
    
    @Override
    public void update(Learner learner) {
        try {
            HelperService.update(UPDATE_SQL,
                    learner.getHoTen(),
                    learner.isGioiTinh(), 
                    learner.getNgaySinh(), 
                    learner.getDienThoai(), 
                    learner.getEmail(),
                    learner.getGhiChu(), 
                    learner.getMaNV(),
                    learner.getMaNH()
            );
        } catch (Exception e) {
        }
    }
    
    @Override
    public Learner selectByID(String manh) {
        if(this.selectBySql(SELECT_BY_ID_SQL, manh).isEmpty()) {
            return null;
        }
        return this.selectBySql(SELECT_BY_ID_SQL, manh).get(0);
    }
    
    @Override
   public List<Learner> selectAll() {
       return this.selectBySql(SELECT_ALL_SQL);
   }
   
    @Override
   protected List<Learner> selectBySql(String sql, Object ...arguments) {
       List<Learner> listLearners = new ArrayList<>();
       try {
           ResultSet resultSet = HelperService.query(sql, arguments);
           while (resultSet.next()) {               
               Learner learner = new Learner();
               learner.setMaNH(resultSet.getString("manh").trim());
               learner.setHoTen(resultSet.getString("hoten"));
               learner.setGioiTinh(resultSet.getBoolean("gioitinh"));
               learner.setNgaySinh(resultSet.getDate("ngaysinh"));
               learner.setDienThoai(resultSet.getString("dienthoai"));
               learner.setEmail(resultSet.getString("email"));
               learner.setMaNV(resultSet.getString("manv"));
               learner.setNgayDK(resultSet.getDate("ngaydk"));
               learner.setGhiChu(resultSet.getString("ghichu"));
               listLearners.add(learner);
           }
           resultSet.getStatement().close();
           return listLearners;
       } catch (SQLException e) {
       }
       return null;
   }
   
   public List<Learner> selectBySearch(String keyWord) {
       return this.selectBySql(SEARCH_SQL, "%"+keyWord+"%");
   }

   public List<Learner> selectByLearnersNotInCourse(int makh,String keyWord) {
       return this.selectBySql(SELECT_LEARNERS_NOT_IN_COURSE,"%"+ keyWord+"%", makh);
   }
}
