package javaweb;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc1 {

    public static void main(String[] args) {
        try {
            //1����������
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2����ȡ���ݿ�����
            String url = "jdbc:mysql://localhost:3306/web-soft?serverTimezone=UTC";
            String username = "root";
            String password = "110120";
            Connection connection =
                    DriverManager.getConnection(url, username, password);
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
