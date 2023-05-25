package java_book_example.FileIO.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example11_7 {
    public static void main(String[] args) {
        Connection con = null;
        Statement sql;
        ResultSet rs;
        String sqlStr;
        con = GetDBCConnection.connectDB("students", "root", "110120");
        if (con == null)
            return;
        try {
            float n = 0.02f;
            con.setAutoCommit(false);//关闭自动提交模式,改为事务
            sql = con.createStatement();//返回Statement对象
            sqlStr = "select name,height from mess where number='R1001'";
            rs = sql.executeQuery(sqlStr);
            rs.next();
            float h1 = rs.getFloat(2);
            System.out.println("事务之前" + rs.getString(1) + "身高：" + h1);
            sqlStr = "select name,height from mess where number='R1001'";
            rs = sql.executeQuery(sqlStr);
            rs.next();
            float h2 = rs.getFloat(2);
            System.out.println("事务之前" + rs.getString(1) + "身高：" + h2);
            h1 -= n;
            h2 += n;
            sqlStr = "update mess set height =" + h1 + " where number='R1001'";
            sql.executeUpdate(sqlStr);
            sqlStr = "update mess set height =" + h2 + " where number='R1003'";
            sql.executeUpdate(sqlStr);
            con.commit();//开始事务处理，如果发生一次直接执行catch代码块
            con.setAutoCommit(true);//恢复自动提交模式
            String s = "select name,height from mess" + " where number='R1001' or number='R1003'";
            rs = sql.executeQuery(s);
            while (rs.next()) {
                System.out.println("事务后" + rs.getString(1) + "身高：" + rs.getFloat(2));
            }
            con.close();
        } catch (SQLException e) {
            try {
                con.rollback();//撤销事务语句
            } catch (SQLException ignored) {
            }
        }
    }
}
