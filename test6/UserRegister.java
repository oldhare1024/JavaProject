package test6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * ע�����
 *
 */
public class UserRegister extends JFrame {
    UserRegister() {
        init();
    }

    void init() {
        JFrame frame = new JFrame("ע���˺�");
        frame.setLayout(null);

        JLabel nameStr = new JLabel("�û���:");
        nameStr.setBounds(250, 150, 100, 25);
        frame.add(nameStr);

        JLabel IDStr = new JLabel("�˺�:");
        IDStr.setBounds(250, 200, 100, 25);
        frame.add(IDStr);

        JLabel passwordStr = new JLabel("����:");
        passwordStr.setBounds(250, 250, 100, 25);
        frame.add(passwordStr);

        JLabel confrimStr = new JLabel("ȷ������:");
        confrimStr.setBounds(250, 300, 100, 30);
        frame.add(confrimStr);

        JTextField userName = new JTextField();
        userName.setBounds(320, 150, 150, 25);
        frame.add(userName);

        JTextField userID = new JTextField();
        userID.setBounds(320, 200, 150, 25);
        frame.add(userID);

        JPasswordField password = new JPasswordField();
        password.setBounds(320, 250, 150, 25);
        frame.add(password);

        JPasswordField confrimPassword = new JPasswordField();
        confrimPassword.setBounds(320, 300, 150, 25);
        frame.add(confrimPassword);

        JButton buttonregister = new JButton("ע��");
        buttonregister.setBounds(350, 350, 70, 25);
        frame.add(buttonregister);

        frame.setBounds(400, 100, 800, 640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // Ϊע�ᰴť��������������
        buttonregister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = userName.getText();
                String ID = userID.getText();
                String passwd = new String(password.getPassword());
                String confrimpasswd = new String(confrimPassword.getPassword());

                // ����Register��
                Register register = new Register();
                register.setID(ID);
                register.setName(name);
                register.setPassword(passwd);
                register.setconfirmpasswd(confrimpasswd);

                // ���ע��ɹ������ص�¼����
                if (register.JudgeRegister()) {
                    frame.setVisible(false);
                    Login_Register login_register = new Login_Register();
                }
            }

        });
    }
}