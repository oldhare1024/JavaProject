package sjk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class operate2 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton b1, b2, b3, b4;
    private JLabel c1, c2, c3, c4, c5, c6, c7, c8, c9, d1, d2, d3, d4;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, ce1, ce2, ce3, ce4;
    private JTextField search1, search2;
    private JLabel name, name2, action1, action2;
    private String corpname, corpname2;

    public operate2() {
        super("operate2");
        setSize(800, 600);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        Container container = getContentPane();

        action1 = new JLabel("  查看企业的资料", JLabel.RIGHT);
        action2 = new JLabel("  查看用户的资料", JLabel.RIGHT);

        name = new JLabel("输入企业名：", JLabel.RIGHT);

        c1 = new JLabel("企业编号：", JLabel.RIGHT);
        c2 = new JLabel("企业名称：", JLabel.RIGHT);
        c3 = new JLabel("企业代表人：", JLabel.RIGHT);
        c4 = new JLabel("企业联系电话：", JLabel.RIGHT);
        c5 = new JLabel("企业谷电量：", JLabel.RIGHT);
        c6 = new JLabel("企业峰电量：", JLabel.RIGHT);
        c7 = new JLabel("年月份：", JLabel.RIGHT);
        c8 = new JLabel("企业合计电量：", JLabel.RIGHT);
        c9 = new JLabel("企业合计电费：", JLabel.RIGHT);

        name2 = new JLabel("输入职工名：", JLabel.RIGHT);

        d1 = new JLabel("职工编号：", JLabel.RIGHT);
        d2 = new JLabel("职工名称：", JLabel.RIGHT);
        d3 = new JLabel("职工密码：", JLabel.RIGHT);
        d4 = new JLabel("职工等级：", JLabel.RIGHT);

        b1 = new JButton("查询");
        b2 = new JButton("取消");
        b3 = new JButton("查询");
        b4 = new JButton("取消");


        t1 = new JTextField(200);
        t2 = new JTextField(200);
        t3 = new JTextField(200);
        t4 = new JTextField(200);
        t5 = new JTextField(200);
        t6 = new JTextField(200);
        t7 = new JTextField(200);
        t8 = new JTextField(200);
        t9 = new JTextField(200);

        ce1 = new JTextField(200);
        ce2 = new JTextField(200);
        ce3 = new JTextField(200);
        ce4 = new JTextField(200);

        search1 = new JTextField(60);
        search2 = new JTextField(60);

        action1.setBounds(200, 10, 200, 30);
        action2.setBounds(200, 300, 200, 30);

        name.setBounds(80, 50, 100, 30);
        name2.setBounds(80, 330, 100, 30);

        c1.setBounds(80, 100, 100, 30);
        c2.setBounds(80, 130, 100, 30);
        c3.setBounds(80, 160, 100, 30);
        c4.setBounds(80, 190, 100, 30);
        c5.setBounds(80, 220, 100, 30);
        c6.setBounds(80, 250, 100, 30);
        c7.setBounds(80, 280, 100, 30);
        c8.setBounds(80, 310, 100, 30);
        c9.setBounds(80, 340, 100, 30);

        d1.setBounds(80, 360, 100, 30);
        d2.setBounds(80, 390, 100, 30);
        d3.setBounds(80, 420, 100, 30);
        d4.setBounds(80, 450, 100, 30);

        search1.setBounds(200, 50, 100, 25);
        search2.setBounds(200, 330, 100, 25);

        b1.setBounds(370, 52, 60, 25);
        b2.setBounds(500, 52, 60, 25);
        b3.setBounds(370, 332, 60, 25);
        b4.setBounds(500, 332, 60, 25);

        t1.setBounds(200, 100, 350, 30);
        t2.setBounds(200, 130, 350, 30);
        t3.setBounds(200, 160, 350, 30);
        t4.setBounds(200, 190, 350, 30);
        t5.setBounds(200, 220, 350, 30);
        t6.setBounds(200, 250, 350, 30);
        t7.setBounds(200, 280, 350, 30);
        t8.setBounds(200, 310, 350, 30);
        t9.setBounds(200, 340, 350, 30);

        ce1.setBounds(200, 360, 350, 30);
        ce2.setBounds(200, 390, 350, 30);
        ce3.setBounds(200, 420, 350, 30);
        ce4.setBounds(200, 450, 350, 30);

        ButtonactionPerformed buttoner = new ButtonactionPerformed();
        ButtonactionPerformed2 buttoner2 = new ButtonactionPerformed2();
        ButtonactionPerformed3 buttoner3 = new ButtonactionPerformed3();

        b1.addActionListener(buttoner);
        b2.addActionListener(buttoner2);
        b3.addActionListener(buttoner3);
        b4.addActionListener(buttoner2);


        container.add(b1);
        container.add(b2);
        container.add(b3);
        container.add(b4);


        container.add(search1);
        container.add(search2);

        container.add(t1);
        container.add(t2);
        container.add(t3);
        container.add(t4);
        container.add(t5);
        container.add(t6);
        container.add(t7);
        container.add(t8);
        container.add(t9);

        container.add(ce1);
        container.add(ce2);
        container.add(ce3);
        container.add(ce4);

        container.add(name);
        container.add(name2);

        container.add(action1);
        container.add(action2);

        container.add(c1);
        container.add(c2);
        container.add(c3);
        container.add(c4);
        container.add(c5);
        container.add(c6);
        container.add(c7);
        container.add(c8);
        container.add(c9);

        container.add(d1);
        container.add(d2);
        container.add(d3);
        container.add(d4);

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
            try {
                Class.forName("driver");
            } catch (ClassNotFoundException arg0) {
                System.out.print("class not find exception occur.Message is:");
            }
            Statement stmt;
            ResultSet rs;
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect";
            String user = "sa";
            String password = "110120";
            Connection conn;
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("和数据库已经建立连接！！！");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select * from elect ");
                while (rs.next()) {
                    if (rs.getString(2).equals(corpname)) {
                        t1.setText(rs.getString(1));
                        t2.setText(rs.getString(2));
                        t3.setText(rs.getString(3));
                        t4.setText(rs.getString(4));
                        t5.setText(String.valueOf(rs.getFloat(5)));
                        t6.setText(String.valueOf(rs.getFloat(6)));
                        t7.setText(String.valueOf(rs.getDate(7)));
                        t8.setText(String.valueOf(rs.getFloat(8)));
                        t9.setText(String.valueOf(rs.getFloat(9)));
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

    private class ButtonactionPerformed2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            System.exit(0);
        }
    }

    private class ButtonactionPerformed3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            corpname2 = search2.getText();
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException arg0) {
                System.out.println("class not find exception occur. Message is:");
            }
            Statement stmt;
            ResultSet rs;
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect";
            String user = "sa";
            String password = "110120";
            Connection conn;
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("和数据库已经建立连接！！！");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select * from worker ");
                while (rs.next()) {
                    if (rs.getString(2).equals(corpname2)) {
                        ce1.setText(String.valueOf(rs.getInt(1)));
                        ce2.setText(rs.getString(3));
                        ce3.setText(rs.getString(3));
                        ce4.setText(String.valueOf(rs.getInt(4)));
                    }
                    rs.close();
                    stmt.close();
                    conn.close();
                }
            } catch (SQLException eb) {
                System.out.println("SQL exception occur. message is: ");
                System.out.println(eb.getMessage());
            }
        }
    }
}
