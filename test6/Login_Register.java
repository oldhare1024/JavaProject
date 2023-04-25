package test6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Register extends JFrame {

    Login_Register() {
        init();
    }

    public static void main(String[] args) {
        // 主程序
        // 登录窗口
        Login_Register login_register = new Login_Register();
    }

    // 登录界面初始化
    public void init() {
        JFrame frame = new JFrame("登录");
        frame.setLayout(null);

        JLabel nameStr = new JLabel("账号:");
        nameStr.setBounds(250, 100, 100, 25);
        frame.add(nameStr);

        JLabel passwordStr = new JLabel("密码:");
        passwordStr.setBounds(250, 150, 100, 25);
        frame.add(passwordStr);

        JTextField userID = new JTextField();
        userID.setBounds(300, 100, 150, 25);
        frame.add(userID);

        JPasswordField password = new JPasswordField();
        password.setBounds(300, 150, 150, 25);
        frame.add(password);

        JButton btLogin = new JButton("登录");
        btLogin.setBounds(275, 200, 70, 25);
        frame.add(btLogin);

        JButton btRegister = new JButton("注册");
        btRegister.setBounds(375, 200, 70, 25);
        frame.add(btRegister);

        frame.setBounds(400, 100, 700, 340);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // 为登录按钮添加匿名监听器
        btLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ID = userID.getText(); // 获取文本框中的ID
                //获取文本框中的密码提出来
                String passwd = new String(password.getPassword()); //获取文本框中的密码

                // 创建一个User用户，把输入框中的用户名密码和提出来
                User user = new User();
                user.setID(ID);
                user.setPassword(passwd);

                // 登录
                Login login = new Login();
                login.setUser(user);

                if (login.JudgeUser() == 0) {
                    // 弹出账号或密码错误的窗口
                    JOptionPane.showMessageDialog(null, "账号或密码错误", "账号或密码错误", JOptionPane.WARNING_MESSAGE);
                    // 清除密码框中的信息
                    password.setText("");
                    // 清除账号框中的信息
                    userID.setText("");
                } else {
                    // 弹出登录成功的窗口
                    JOptionPane.showMessageDialog(null, "欢迎您," + user.getName(), "登录成功", JOptionPane.NO_OPTION);
                    // 点击确定后会跳转到主窗口
                    frame.setVisible(false);
                }

            }
        });

        // 为注册按钮添加监听器
        btRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 注册页面
                frame.setVisible(false);
                UserRegister ar = new UserRegister();
            }
        });
    }
}
