package java_book_example.FileIO.JDBC;

import java.sql.*;

public class Example11_2 {
    public static void main(String[] args) {
        Connection con;
        Statement sql;
        ResultSet rs;
        con = GetDBCConnection.connectDB("students", "root", "110120");
        if (con == null)
            return;
        try {
            sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = sql.executeQuery("SELECT * FROM mess ");
            rs.last();
            int max = rs.getRow();
            System.out.println("表共有" + max + "条记录，随机抽取两条记录：");
            int[] a = GetRandomNumber.getRandomNumber(max, 2);
            for (int i : a) {//变量i依次遍历数组a
                rs.absolute(i);//游标移动到第i行
                String number = rs.getString(1);
                String name = rs.getString(2);
                Date date = rs.getDate(3);
                float height = rs.getFloat(4);
                System.out.printf("%s\t", number);
                System.out.printf("%s\t", name);
                System.out.printf("%s\t", date);
                System.out.printf("%.2f\n", height);
            }//next方法跳转下一行
            con.close();//关闭数据库连接
        } catch (
                SQLException e) {
            System.out.println(e);
        }
    }
}
