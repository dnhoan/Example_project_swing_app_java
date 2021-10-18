
package edusys.DAO;

import edusys.Service.HelperService;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReportDAO {
    
    String BANGDIEM = "{CALL BANGDIEM(?)}";
    String DOANHTHU = "{CALL DOANHTHU(?)}";
    String CHUYENDE = "{CALL DIEMCHUYENDE}";
    String LUONGNGUOIHOC  = "{CALL LUONGNGUOIHOC}";
    
    List<Object[]> getListOfArray(String sql, String[] cols, Object ...args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet resultSet = HelperService.query(sql, args);
            while (resultSet.next()) {                
                Object[] value = new Object[cols.length];
                for(int i = 0; i < cols.length; i++) {
                    value[i] = resultSet.getObject(cols[i]);
                }
                list.add(value);
            }
            resultSet.getStatement().close();
            return list;
        } catch (SQLException e) {
        }
        return null;
    }
    
    public List<Object[]> getBangDiem(Integer makh) {
        String [] cols = {"manh","hoten","diem"};
        return this.getListOfArray(BANGDIEM, cols, makh);
    }
    
    public List<Object[]> getDoanhThu(Integer year) {
        String [] cols = {"CHUYENDE","SOKH","SOHV","DOANHTHU","THATNHAT","CAONHAT", "TRUNGBINH"};
        return this.getListOfArray(DOANHTHU, cols, year);
    }
    public List<Object[]> getDiemChuyenDe() {
        String [] cols = {"CHUYENDE","SOHV","THAPNHAT","CAONHAT","TRUNGBINH"};
        return this.getListOfArray(CHUYENDE, cols);
    }
    public List<Object[]> getNguoiHoc() {
        String [] cols = {"NAM","SONH","SOMNHAT","MUONNHAT"};
        return this.getListOfArray(LUONGNGUOIHOC, cols);
    }
    
    
}
