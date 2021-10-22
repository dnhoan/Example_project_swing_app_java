
package DAO;

import Service.HelperService;
import Model.Thematic;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ThematicDAO extends EduSysDAO<Thematic, String>{

    String SELECT_ALL = "SELECT * FROM CHUYENDE";
    String SELECT_BY_ID = "SELECT * FROM CHUYENDE WHERE MACD = ?";
    String INSERT_SQL = "INSERT INTO CHUYENDE(MACD,TENCD,HOCPHI,THOILUONG,HINH,MOTA) VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE CHUYENDE SET TENCD = ?, HOCPHI = ?, THOILUONG = ?, HINH = ?, MOTA = ? WHERE MACD = ?";
    String DELETE_SQL = "DELETE FROM CHUYENDE WHERE MACD = ?";
    
    @Override
    public void insert(Thematic thematic) {
        try {
            HelperService.update(INSERT_SQL, 
                    thematic.getMaCD(),
                    thematic.getTenCD(),
                    thematic.getHocPhi(),
                    thematic.getThoiLuong(),
                    thematic.getHinh(),
                    thematic.getMoTa()
            );
                    
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public void update(Thematic thematic) {
        try {
            HelperService.update(UPDATE_SQL, 
                    thematic.getTenCD(),
                    thematic.getHocPhi(),
                    thematic.getThoiLuong(),
                    thematic.getHinh(),
                    thematic.getMoTa(),
                    thematic.getMaCD()
            );
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(String macd) {
        try {
            HelperService.update(DELETE_SQL, macd);
        } catch (Exception e) {
        }
    }

    @Override
    public Thematic selectByID(String macd) {
        if(this.selectBySql(SELECT_BY_ID, macd).isEmpty()) {
            return null;
        }
        return this.selectBySql(SELECT_BY_ID, macd).get(0);
    }

    @Override
    public List<Thematic> selectAll() {
        return this.selectBySql(SELECT_ALL);
    }

    @Override
    protected List<Thematic> selectBySql(String sql, Object... args) {
        List<Thematic> thematics = new ArrayList<>();
        try {
            ResultSet resultSet = HelperService.query(sql, args);
            while (resultSet.next()) {                
                Thematic thematic = new Thematic();
                thematic.setMaCD(resultSet.getString("macd").trim());
                thematic.setTenCD(resultSet.getString("tencd"));
                thematic.setHocPhi(resultSet.getDouble("hocphi"));
                thematic.setThoiLuong(resultSet.getInt("thoiluong"));
                thematic.setHinh(resultSet.getString("hinh"));
                thematic.setMoTa(resultSet.getString("mota"));
                thematics.add(thematic);
            }
            resultSet.getStatement().close();
            return thematics;
        } catch (Exception e) {
        }
        return null;
    }
    

}
