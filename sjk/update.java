package sjk;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton b1, b2;
    private JLabel c1, c2, c3, c4, c5, c6, name;
    private JTextField t1, t2, t3, t4, t5, t6;
    private String x1, x2, x3, x4, x5, x6;

    public update() {
        super("update");
        setSize(800, 600);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        Container container = getContentPane();
        name = new JLabel("请输入要更新的企业编号及其信息", JLabel.RIGHT);

        c1 = new JLabel("企业编号：", JLabel.RIGHT);
        c2 = new JLabel("企业谷电量：", JLabel.RIGHT);
        c3 = new JLabel("企业峰电量：", JLabel.RIGHT);
        c4 = new JLabel("年月份：", JLabel.RIGHT);
        c5 = new JLabel("合计电量：", JLabel.RIGHT);
        c6 = new JLabel("企业用电费：", JLabel.RIGHT);

        b1 = new JButton("确定");
        b2 = new JButton("取消");


        t1 = new JTextField(200);
        t2 = new JTextField(200);
        t3 = new JTextField(200);
        t4 = new JTextField(200);
        t5 = new JTextField(200);
        t6 = new JTextField(200);

        name.setBounds(150, 10, 300, 30);

        c1.setBounds(80, 60, 100, 30);
        c2.setBounds(80, 90, 100, 30);
        c3.setBounds(80, 120, 100, 30);
        c4.setBounds(80, 150, 100, 30);
        c5.setBounds(80, 180, 100, 30);
        c6.setBounds(80, 210, 100, 30);

        b1.setBounds(250, 210, 60, 25);
        b2.setBounds(350, 210, 60, 25);

        t1.setBounds(300, 60, 100, 30);
        t2.setBounds(300, 90, 100, 30);
        t3.setBounds(300, 120, 100, 30);
        t4.setBounds(300, 150, 100, 30);
        t5.setBounds(300, 180, 100, 30);
        t6.setBounds(300, 210, 100, 30);

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

        container.add(c1);
        container.add(c2);
        container.add(c3);
        container.add(c4);
        container.add(c5);
        container.add(c6);

        container.setBackground(Color.lightGray);
        container.setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        update app = new update();
        app.setLocationRelativeTo(null);
    }

    private class ButtonactionPerformed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect";
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String user = "sa";
            String password = "110120";
            PreparedStatement prepstmt2;
            Connection conn;
            x1 = t1.getText();
            x2 = t2.getText();
            x3 = t3.getText();
            x4 = t4.getText();
            x5 = t5.getText();
            x6 = t6.getText();
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException arg0) {
                System.out.println("class not find exception occur. Message is :");
            }
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException arg0) {
                System.out.println("class not find exception occur. Message is :");
            }
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("和数据库已经建立连接！！！");
                prepstmt2 = conn.prepareStatement("UPDATE company SET id=?,vvolume=?,pvolume=?,date=?,svolume=?,sbill=? WHERE id=?");
                prepstmt2.setString(1, x1);
                prepstmt2.setString(2, x2);
                prepstmt2.setString(3, x3);
                prepstmt2.setString(4, x4);
                prepstmt2.setString(4, x5);
                prepstmt2.setString(4, x6);
                prepstmt2.setString(5, x1);
                prepstmt2.executeUpdate();
                prepstmt2.close();
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
