package JDBC;

import java.sql.*;


public class test {
    public static void main(String[] args) {
        Connection con = null;
        Statement sql;
        ResultSet rs1;
        String uri = "jdbc:mysql://127.0.0.1:3306/students?user=root&password=110120&useSSL=true&characterEncoding=utf-8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//加载JDBC-MYSQL驱动
        } catch (Exception e) {
        }
        try {
            con = DriverManager.getConnection(uri);//连接代码
            sql = con.createStatement();
            rs1 = sql.executeQuery("SELECT * FROM mess");//查询表sql代码
            //ResultSet rs2 = sql.executeQuery("SELECT name,height FROM students");
            while (rs1.next()) {
                String number = rs1.getString(1);
                String name = rs1.getString(2);
                Date d = rs1.getDate(3);
                float height = rs1.getFloat(4);
                System.out.printf("%s\t", number);
                System.out.printf("%s\t", name);
                System.out.printf("%s\t", d);
                System.out.printf("%.2f\n", height);
            }//next方法跳转下一行
            con.close();//关闭数据库连接
        } catch (
                SQLException e) {
            System.out.println(e);
        }
    }
}
