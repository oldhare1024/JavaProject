package sjk;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton b1, b2;
    private JLabel c1, c2, c3, c4, c5, c6, c7, c8, c9, name;
    private JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    private String x1, x2, x3, x4, x5, x6, x7, x8, x9;

    public insert() {
        super("insert");
        setSize(800, 600);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        Container container = getContentPane();
        name = new JLabel("请输入要添加企业的信息", JLabel.RIGHT);

        c1 = new JLabel("企业编号：", JLabel.RIGHT);
        c2 = new JLabel("企业名称：", JLabel.RIGHT);
        c3 = new JLabel("企业代表人：", JLabel.RIGHT);
        c4 = new JLabel("企业联系电话：", JLabel.RIGHT);
        c5 = new JLabel("企业谷电量：", JLabel.RIGHT);
        c6 = new JLabel("企业峰电量：", JLabel.RIGHT);
        c7 = new JLabel("年月份：", JLabel.RIGHT);
        c8 = new JLabel("企业总用电量：", JLabel.RIGHT);
        c9 = new JLabel("企业用电费：", JLabel.RIGHT);

        b1 = new JButton("确定");
        b2 = new JButton("取消");


        t1 = new JTextField(200);
        t2 = new JTextField(200);
        t3 = new JTextField(200);
        t4 = new JTextField(200);
        t5 = new JTextField(200);
        t6 = new JTextField(200);
        t7 = new JTextField(200);
        t8 = new JTextField(200);
        t9 = new JTextField(200);

        name.setBounds(240, 10, 200, 30);

        c1.setBounds(80, 60, 100, 30);
        c2.setBounds(80, 90, 100, 30);
        c3.setBounds(80, 120, 100, 30);
        c4.setBounds(80, 150, 100, 30);
        c5.setBounds(80, 180, 100, 30);
        c6.setBounds(80, 210, 100, 30);
        c7.setBounds(80, 240, 100, 30);
        c8.setBounds(80, 270, 100, 30);
        c9.setBounds(80, 300, 100, 30);

        b1.setBounds(250, 280, 100, 25);
        b2.setBounds(450, 280, 100, 25);

        t1.setBounds(200, 60, 350, 30);
        t2.setBounds(200, 90, 350, 30);
        t3.setBounds(200, 120, 350, 30);
        t4.setBounds(200, 150, 350, 30);
        t5.setBounds(200, 180, 350, 30);
        t6.setBounds(200, 210, 350, 30);
        t7.setBounds(200, 240, 350, 30);
        t8.setBounds(200, 270, 350, 30);
        t9.setBounds(200, 300, 350, 30);

        ButtonactionPerformed buttoner = new ButtonactionPerformed();
        ButtonactionPerformed2 buttoner2 = new ButtonactionPerformed2();

        b1.addActionListener(buttoner);
        b2.addActionListener(buttoner2);

        container.add(b1);
        container.add(b2);

        container.add(name);

        container.add(t1);
        container.add(t2);
        container.add(t3);
        container.add(t4);
        container.add(t5);
        container.add(t6);
        container.add(t7);
        container.add(t8);
        container.add(t9);

        container.add(c1);
        container.add(c2);
        container.add(c3);
        container.add(c4);
        container.add(c5);
        container.add(c6);
        container.add(c7);
        container.add(c8);
        container.add(c9);

        container.setBackground(Color.lightGray);
        container.setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        insert app = new insert();
        app.setLocationRelativeTo(null);
    }

    private class ButtonactionPerformed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            PreparedStatement prepstmt1;
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect";
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String user = "sa";
            String password = "110120";
            Connection conn;
            x1 = t1.getText();
            x2 = t1.getText();
            x3 = t1.getText();
            x4 = t1.getText();
            x5 = t1.getText();
            x6 = t1.getText();
            x7 = t1.getText();
            x8 = t1.getText();
            x9 = t1.getText();
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException arg0) {
                System.out.println("class not find exception occur. Message is :");
            }
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("和数据库已经建立连接！！！");
                prepstmt1 = conn.prepareStatement("INSERT INTO company(id,name,address,phonenum,linkman)" + "Value(?+?+?+?+?)");
                prepstmt1.setString(1, x1);
                prepstmt1.setString(2, x2);
                prepstmt1.setString(3, x3);
                prepstmt1.setString(4, x4);
                prepstmt1.setString(5, x5);
                prepstmt1.setString(6, x6);
                prepstmt1.setString(7, x7);
                prepstmt1.setString(8, x8);
                prepstmt1.setString(9, x9);
                prepstmt1.executeUpdate();
                conn.close();
            } catch (SQLException eb) {
                System.out.println("SQL exception occur. Message is:" + eb.getMessage());
                System.out.println(eb.getMessage());
            }
        }
    }

    private class ButtonactionPerformed2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            operate app4 = new operate();
            app4.setLocationRelativeTo(null);
        }
    }
}
