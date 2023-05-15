package sjk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.*;

public class login extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JLabel username, password;
    private final JTextField username2, password2, message;
    private final JButton button;
    private final JRadioButton box1, box2;
    private final ButtonGroup buttongroup;
    private String a, s, c = "", b = "";
    private int level = 2;
    private boolean flag = false;

    public login() {
        super("login");
        setSize(480, 320);
        this.setLocationRelativeTo(null);//��������Ļ�м���ʾ
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        Container container = getContentPane();
        container.setBackground(Color.lightGray);
        container.setLayout(null);
        username = new JLabel("�û�����", JLabel.RIGHT);
        password = new JLabel("���룺", JLabel.RIGHT);
        buttongroup = new ButtonGroup();
        box1 = new JRadioButton("Ա��", true);
        box2 = new JRadioButton("����Ա", true);
        username2 = new JTextField(20);
        password2 = new JTextField(20);
        message = new JTextField("��ӭʹ����ҵ�õ����ϵͳ");
        message.setHorizontalAlignment(JTextField.CENTER);
        button = new JButton("��¼");
        username.setBounds(50, 50, 85, 25);
        username2.setBounds(130, 50, 120, 25);
        password.setBounds(55, 85, 80, 25);
        password2.setBounds(130, 85, 120, 25);
        message.setBounds(55, 160, 190, 25);
        box1.setBounds(50, 120, 70, 25);
        box2.setBounds(120, 120, 80, 25);
        button.setBounds(210, 120, 80, 25);
        buttongroup.add(box1);
        buttongroup.add(box2);
        ButtonactionPerformed buttoner = new ButtonactionPerformed();
        button.addActionListener(buttoner);
        RadioButtonHandle handle = new RadioButtonHandle();
        box1.addItemListener(handle);
        box2.addItemListener(handle);
        container.add(username);
        container.add(username2);
        container.add(password);
        container.add(password2);
        container.add(box1);
        container.add(box2);
        container.add(button);
        container.add(message);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        login app = new login();
        app.setLocationRelativeTo(null);
    }

    private class RadioButtonHandle implements ItemListener {
        public void itemStateChanged(ItemEvent event) {
            if (box1.isSelected()) {
                message.setText("Ա����¼");
                level = 2;
            } else if (box2.isSelected()) {
                message.setText("����Ա��¼");
                level = 1;
            }
        }
    }

    private class ButtonactionPerformed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = username2.getText();
            s = password2.getText();
            Statement stmt;
            ResultSet rs;
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect;encrypt=true;trustServerCertificate=true;";
            String user = "sa";
            String password = "110120";
            Connection conn;
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException arg0) {
                System.out.print("class not find exception occur.message is:");
            }
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("�����ݿ��Ѿ��������ӣ�����");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select * from euser ");
                if (c.equals(a) && b.equals(s)) {
                    message.setText("�˺Ż����벻��Ϊ��");
                } else {
                    while (rs.next()) {
                        if (rs.getString(2).equals(a) && rs.getString(3).equals(s) && rs.getInt(4) == level) {
                            message.setText("��¼�ɹ���");
                            flag = true;
                            if (level == 1) {
                                operate2 app2 = new operate2();
                                app2.setLocationRelativeTo(null);
                            } else {
                                operate app3 = new operate();
                                app3.setLocationRelativeTo(null);
                            }
                        }
                    }
                    if (!flag)
                        message.setText("�û��������������ݲ���ȷ");
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException eb) {
                System.out.println("SQL exception occur. message is: ");
                System.out.println(eb.getMessage());
            }
        }
    }
}