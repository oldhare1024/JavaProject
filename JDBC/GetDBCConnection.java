package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetDBCConnection {
    public static Connection connectDB(String DBName, String id, String p) {
        Connection con = null;
        String uri = "jdbc:mysql://localhost:3306/" + DBName + "?useSSL=true&characterEncoding=utf-8";
        try {
            Class.forName("com.cj.mysql.jdbc.Driver");//��������
        } catch (Exception e) {
        }
        try {
            con = DriverManager.getConnection(uri, id, p);//���Ӵ���
        } catch (SQLException e) {
        }
        return con;
    }
}
