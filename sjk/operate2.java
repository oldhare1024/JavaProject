package sjk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class operate2 extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JButton b1, b2, b3, b4;
    private final JLabel c1, c2, c3, c4, c5;
    private final JTextField t1, t2, t3, t4, t5;
    private final JTextField search1;
    private final JLabel name, action1;
    private String corpname;

    public operate2() {
        super("operate2");
        setSize(800, 600);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        Container container = getContentPane();

        action1 = new JLabel("  �鿴��ҵ������", JLabel.RIGHT);


        name = new JLabel("������ҵ����", JLabel.RIGHT);
        c1 = new JLabel("��ҵ��ţ�", JLabel.RIGHT);
        c2 = new JLabel("��ҵ���ƣ�", JLabel.RIGHT);
        c3 = new JLabel("��ҵ��ַ��", JLabel.RIGHT);
        c4 = new JLabel("��ҵ��ϵ�绰��", JLabel.RIGHT);
        c5 = new JLabel("��ҵ�����ˣ�", JLabel.RIGHT);


        b1 = new JButton("��ѯ");
        b2 = new JButton("ȡ��");
        b3 = new JButton("��ѯ���");
        b4 = new JButton("��ѯ���");

        t1 = new JTextField(200);
        t2 = new JTextField(200);
        t3 = new JTextField(200);
        t4 = new JTextField(200);
        t5 = new JTextField(200);

        search1 = new JTextField(60);

        action1.setBounds(200, 10, 200, 30);

        name.setBounds(80, 50, 100, 30);

        c1.setBounds(80, 100, 100, 30);
        c2.setBounds(80, 130, 100, 30);
        c3.setBounds(80, 160, 100, 30);
        c4.setBounds(60, 190, 120, 30);
        c5.setBounds(80, 220, 100, 30);

        search1.setBounds(200, 50, 100, 25);

        b1.setBounds(370, 52, 80, 25);
        b2.setBounds(460, 52, 80, 25);
        b3.setBounds(550, 52, 100, 25);
        b4.setBounds(670, 52, 100, 25);

        t1.setBounds(200, 100, 350, 30);
        t2.setBounds(200, 130, 350, 30);
        t3.setBounds(200, 160, 350, 30);
        t4.setBounds(200, 190, 350, 30);
        t5.setBounds(200, 220, 350, 30);


        ButtonactionPerformed buttoner = new ButtonactionPerformed();
        ButtonactionPerformed2 buttoner2 = new ButtonactionPerformed2();
        ButtonactionPerformed3 buttoner3 = new ButtonactionPerformed3();
        ButtonactionPerformed4 buttoner4 = new ButtonactionPerformed4();

        b1.addActionListener(buttoner);
        b2.addActionListener(buttoner2);
        b3.addActionListener(buttoner3);
        b4.addActionListener(buttoner4);

        container.add(b1);
        container.add(b2);
        container.add(b3);
        container.add(b4);

        container.add(search1);

        container.add(t1);
        container.add(t2);
        container.add(t3);
        container.add(t4);
        container.add(t5);

        container.add(name);
        container.add(action1);

        container.add(c1);
        container.add(c2);
        container.add(c3);
        container.add(c4);
        container.add(c5);

        container.setBackground(Color.lightGray);
        container.setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        operate2 app = new operate2();
        app.setLocationRelativeTo(null);
    }

    private class ButtonactionPerformed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            corpname = search1.getText();
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException arg0) {
                System.out.print("class not find exception occur.Message is:");
            }
            Statement stmt;
            ResultSet rs;
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect;encrypt=true;trustServerCertificate=true;";
            String user = "sa";
            String password = "110120";
            Connection conn;
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("�����ݿ��Ѿ��������ӣ�����");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select * from company ");
                while (rs.next()) {
                    if (rs.getString(2).equals(corpname)) {
                        t1.setText(rs.getString(1));
                        t2.setText(rs.getString(2));
                        t3.setText(rs.getString(3));
                        t4.setText(rs.getString(4));
                        t5.setText(rs.getString(5));
                    }
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException eb) {
                System.out.println("SQL exception occur. Message is:" + eb.getMessage());
            }
        }
    }

    private static class ButtonactionPerformed3 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            create app6 = new create();
            app6.setLocationRelativeTo(null);
        }
    }

    private static class ButtonactionPerformed4 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            search app5 = new search();
            app5.setLocationRelativeTo(null);
        }
    }

    private class ButtonactionPerformed2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

}