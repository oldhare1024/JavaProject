package JDBC;

import java.sql.*;

public class Example11_5 {
    public static void main(String[] args) {
        Connection con;
        PreparedStatement presql;
        ResultSet rs;
        con = GetDBCConnection.connectDB("students", "root", "110120");
        if (con == null)
            return;
        String sqlStr = "insert into mess values(?,?,?,?)";
        try {
            presql = con.prepareStatement(sqlStr);//�õ�Ԥ����������preSql
            presql.setString(1, "A001");
            presql.setString(2, "��ΰ");
            presql.setString(3, "1999-9-10");
            presql.setFloat(4, 1.77f);
            //����4����ͨ�����ֵ
            int ok = presql.executeUpdate();
            sqlStr = "select * from mess where name like ?;";
            presql = con.prepareStatement(sqlStr);
            presql.setString(1, "��%");//�õ�������Ԥ�������presql
            rs = presql.executeQuery();//���õ�һ���������ֵ
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
            System.out.println("��¼��numberֵ�����ظ�" + e);
        }
    }
}
