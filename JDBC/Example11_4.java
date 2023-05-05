package JDBC;

import java.sql.*;

public class Example11_4 {
    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet rs;
        con = GetDBCConnection.connectDB("students", "root", "110120");
        if (con == null)
            return;
        String jiLu = "('R11','蒋三','2000-10-23',1.66)," + "('R10','李武','1989-7-22',1.76)";//添加两条记录
        String sqlStr = "insert into mess values" + jiLu;
        try {
            sql = con.createStatement();
            int ok = sql.executeUpdate(sqlStr);
            rs = sql.executeQuery("Select * from mess");
            while (rs.next()) {
                String number = rs.getString(1);
                String name = rs.getString(2);
                Date date = rs.getDate(3);
                float height = rs.getFloat(4);
                System.out.printf("%s\t", number);
                System.out.printf("%s \t", name);
                System.out.printf("%s\t", date);
                System.out.printf("%.2f\n", height);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("记录中number值不能重复" + e);
        }
    }
}
