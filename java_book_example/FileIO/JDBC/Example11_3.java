package java_book_example.FileIO.JDBC;

import java.sql.*;

public class Example11_3 {
    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet rs;
        con = GetDBCConnection.connectDB("students", "root", "110120");
        if (con == null)
            return;
        String c1 = " year(birthday)<=2000 and month(birthday)>7";//条件一
        String c2 = " name like '张_%'";//条件二
        String c3 = " height >1.65";//条件三
        String sqlstr = "SELECT * FROM mess WHERE " + c1 + " and" + c2 + " and" + c3 + " ORDER BY BIRTHDAY";
        //组合条件形成sql语句
        try {
            sql = con.createStatement();
            rs = sql.executeQuery(sqlstr);
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
            System.out.println(e);
        }
    }
}
