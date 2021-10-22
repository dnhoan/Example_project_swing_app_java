package DAO;

import Model.Employee;
import Service.HelperService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class EmployeeDAO extends EduSysDAO<Employee, String> {

    String INSERT_SQL = "INSERT INTO NHANVIEN(MANV,MATKHAU,HOTEN,VAITRO) VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE NHANVIEN SET MATKHAU = ?, HOTEN = ?, VAITRO = ? WHERE MANV = ?";
    String DELETE_SQL = "DELETE FROM NHANVIEN WHERE MANV = ?";
    String SELECT_ALL_SQL = "SELECT * FROM NHANVIEN";
    String SELECT_BY_ID_SQL = "SELECT * FROM NHANVIEN WHERE MANV = ?";

    @Override
    public void insert(Employee employee) {
        try {
            HelperService.update(INSERT_SQL, employee.getMaNV(), employee.getMatKhau(), employee.getHoTen(), employee.isVaiTro());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void update(Employee employee) {
        try {
            HelperService.update(UPDATE_SQL, employee.getMatKhau(), employee.getHoTen(),  employee.isVaiTro(), employee.getMaNV());
        } catch (SQLException ex) {
        }
    }

    @Override
    public void delete(String id) {
        try {
            HelperService.update(DELETE_SQL, id);
        } catch (SQLException ex) {
        }
    }

    @Override
    public Employee selectByID(String id) {
        if (this.selectBySql(SELECT_BY_ID_SQL, id).isEmpty()) {
            return null;
        }
        return this.selectBySql(SELECT_BY_ID_SQL, id).get(0);
    }

    @Override
    public List<Employee> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<Employee> selectBySql(String sql, Object... args) {
        List<Employee> listEmployees = new ArrayList<Employee>();
        try {
            ResultSet resultSet = HelperService.query(sql, args);
            while (resultSet.next()) {
                Employee emp = new Employee();
                emp.setMaNV(resultSet.getString("manv"));
                emp.setMatKhau(resultSet.getString("matkhau"));
                emp.setHoTen(resultSet.getString("hoten"));
                emp.setVaiTro(resultSet.getBoolean("vaitro"));
                listEmployees.add(emp);
            }
            resultSet.getStatement().close();
            return listEmployees;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
