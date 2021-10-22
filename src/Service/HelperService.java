
package Service;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperService {
    static String driver = "com.microsoft.sqlserver.SQLServerDriver";
    static String dburl= "jdbc:sqlserver://localhost:1433;databaseName=EduSys";
    static String user ="user";
    static String password = "1234";
    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
        }
    }
    
    public static PreparedStatement getStatement(String sql, Object ...args) throws SQLException{
        Connection connection = DriverManager.getConnection(dburl, user, password);
        PreparedStatement preparedStatement;
        if(sql.trim().startsWith("{")) {
            preparedStatement = connection.prepareCall(sql);
        } else {
            preparedStatement = connection.prepareStatement(sql);
        }
        for(int i = 0; i < args.length; i++) {
            preparedStatement.setObject(i+1, args[i]);
        }
        return preparedStatement;
    }
    public static int update(String sql, Object ...args) throws SQLException{
        try {
            PreparedStatement preparedStatement = HelperService.getStatement(sql, args);
            try {
                return preparedStatement.executeUpdate();
            } 
            finally {
                preparedStatement.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static ResultSet query(String sql, Object ...args) throws SQLException{
        PreparedStatement preparedStatement = HelperService.getStatement(sql, args);
        return preparedStatement.executeQuery();
    }
    public static Object value(String sql, Object ...args){
        try {
            ResultSet resultSet = HelperService.query(sql, args);
            if(resultSet.next()) {
                return resultSet.getObject(0);
            }
            resultSet.getStatement().getConnection().close();
            return  null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
