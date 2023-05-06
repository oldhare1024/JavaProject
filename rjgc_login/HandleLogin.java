package rjgc_login;

import javax.swing.*;
import java.sql.*;

public class HandleLogin {
    Connection con;
    PreparedStatement preSql;
    ResultSet rs;

    public HandleLogin() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
        }
        String uri = "jdbc:mysql://localhost:3306/user?useSSL=true";
        try {
            con = DriverManager.getConnection(uri, "root", "110120");
        } catch (SQLException e) {
        }
    }

    public Login queryVerify(Login loginModel) {
        String id = loginModel.getId();
        String pw = loginModel.getPassword();
        String sqlStr = "select id,password from register where id = ? and password = ?";
        try {
            preSql = con.prepareStatement(sqlStr);
            preSql.setString(1, id);
            preSql.setString(2, pw);
            rs = preSql.executeQuery();
            if (rs.next() == true) {//����Ƿ���ע����û�
                loginModel.setLoginSuccess(true);
                JOptionPane.showMessageDialog(null, "��½�ɹ�", "��ϲ", JOptionPane.WARNING_MESSAGE);
            } else {
                loginModel.setLoginSuccess(false);
                JOptionPane.showMessageDialog(null, "��¼ʧ��", "�����µ�¼", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        } catch (SQLException e) {
        }
        return loginModel;
    }
}
