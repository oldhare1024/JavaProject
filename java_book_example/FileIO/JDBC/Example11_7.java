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
            con.setAutoCommit(false);//�ر��Զ��ύģʽ,��Ϊ����
            sql = con.createStatement();//����Statement����
            sqlStr = "select name,height from mess where number='R1001'";
            rs = sql.executeQuery(sqlStr);
            rs.next();
            float h1 = rs.getFloat(2);
            System.out.println("����֮ǰ" + rs.getString(1) + "��ߣ�" + h1);
            sqlStr = "select name,height from mess where number='R1001'";
            rs = sql.executeQuery(sqlStr);
            rs.next();
            float h2 = rs.getFloat(2);
            System.out.println("����֮ǰ" + rs.getString(1) + "��ߣ�" + h2);
            h1 -= n;
            h2 += n;
            sqlStr = "update mess set height =" + h1 + " where number='R1001'";
            sql.executeUpdate(sqlStr);
            sqlStr = "update mess set height =" + h2 + " where number='R1003'";
            sql.executeUpdate(sqlStr);
            con.commit();//��ʼ�������������һ��ֱ��ִ��catch�����
            con.setAutoCommit(true);//�ָ��Զ��ύģʽ
            String s = "select name,height from mess" + " where number='R1001' or number='R1003'";
            rs = sql.executeQuery(s);
            while (rs.next()) {
                System.out.println("�����" + rs.getString(1) + "��ߣ�" + rs.getFloat(2));
            }
            con.close();
        } catch (SQLException e) {
            try {
                con.rollback();//�����������
            } catch (SQLException ignored) {
            }
        }
    }
}
