package test6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Register extends JFrame {

    Login_Register() {
        init();
    }

    public static void main(String[] args) {
        // ������
        // ��¼����
        Login_Register login_register = new Login_Register();
    }

    // ��¼�����ʼ��
    public void init() {
        JFrame frame = new JFrame("��¼");
        frame.setLayout(null);

        JLabel nameStr = new JLabel("�˺�:");
        nameStr.setBounds(250, 100, 100, 25);
        frame.add(nameStr);

        JLabel passwordStr = new JLabel("����:");
        passwordStr.setBounds(250, 150, 100, 25);
        frame.add(passwordStr);

        JTextField userID = new JTextField();
        userID.setBounds(300, 100, 150, 25);
        frame.add(userID);

        JPasswordField password = new JPasswordField();
        password.setBounds(300, 150, 150, 25);
        frame.add(password);

        JButton btLogin = new JButton("��¼");
        btLogin.setBounds(275, 200, 70, 25);
        frame.add(btLogin);

        JButton btRegister = new JButton("ע��");
        btRegister.setBounds(375, 200, 70, 25);
        frame.add(btRegister);

        frame.setBounds(400, 100, 700, 340);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Ϊ��¼��ť�������������
        btLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ID = userID.getText(); // ��ȡ�ı����е�ID
                //��ȡ�ı����е����������
                String passwd = new String(password.getPassword()); //��ȡ�ı����е�����

                // ����һ��User�û�����������е��û�������������
                User user = new User();
                user.setID(ID);
                user.setPassword(passwd);

                // ��¼
                Login login = new Login();
                login.setUser(user);

                if (login.JudgeUser() == 0) {
                    // �����˺Ż��������Ĵ���
                    JOptionPane.showMessageDialog(null, "�˺Ż��������", "�˺Ż��������", JOptionPane.WARNING_MESSAGE);
                    // ���������е���Ϣ
                    password.setText("");
                    // ����˺ſ��е���Ϣ
                    userID.setText("");
                } else {
                    // ������¼�ɹ��Ĵ���
                    JOptionPane.showMessageDialog(null, "��ӭ��," + user.getName(), "��¼�ɹ�", JOptionPane.NO_OPTION);
                    // ���ȷ�������ת��������
                    frame.setVisible(false);
                }

            }
        });

        // Ϊע�ᰴť��Ӽ�����
        btRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // ע��ҳ��
                frame.setVisible(false);
                UserRegister ar = new UserRegister();
            }
        });
    }
}
