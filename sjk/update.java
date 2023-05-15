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
    private final JButton b1, b2;
    private final JLabel c1, c2, c3, c4, c5, c6, c7, c8, name;
    private final JTextField t1, t2, t3, t4, t5, t6, t7, t8;
    private String x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;

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
        c2 = new JLabel("企业名称：", JLabel.RIGHT);
        c3 = new JLabel("企业地址：", JLabel.RIGHT);
        c4 = new JLabel("企业联系电话：", JLabel.RIGHT);
        c5 = new JLabel("企业代表人：", JLabel.RIGHT);
        c6 = new JLabel("谷电量：", JLabel.RIGHT);
        c7 = new JLabel("峰电量：", JLabel.RIGHT);
        c8 = new JLabel("年月份：", JLabel.RIGHT);

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

        name.setBounds(150, 10, 300, 30);

        c1.setBounds(80, 100, 100, 30);
        c2.setBounds(80, 130, 100, 30);
        c3.setBounds(80, 160, 100, 30);
        c4.setBounds(60, 190, 120, 30);
        c5.setBounds(80, 220, 100, 30);
        c6.setBounds(80, 250, 100, 30);
        c7.setBounds(80, 280, 100, 30);
        c8.setBounds(80, 310, 100, 30);

        b1.setBounds(250, 360, 80, 25);
        b2.setBounds(350, 360, 80, 25);

        t1.setBounds(200, 100, 350, 30);
        t2.setBounds(200, 130, 350, 30);
        t3.setBounds(200, 160, 350, 30);
        t4.setBounds(200, 190, 350, 30);
        t5.setBounds(200, 220, 350, 30);
        t6.setBounds(200, 250, 350, 30);
        t7.setBounds(200, 280, 350, 30);
        t8.setBounds(200, 310, 350, 30);

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

        container.add(c1);
        container.add(c2);
        container.add(c3);
        container.add(c4);
        container.add(c5);
        container.add(c6);
        container.add(c7);
        container.add(c8);

        container.setBackground(Color.lightGray);
        container.setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        update app = new update();
        app.setLocationRelativeTo(null);
    }

    private class ButtonactionPerformed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect;encrypt=true;trustServerCertificate=true;";
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
            x7 = t7.getText();
            x8 = t8.getText();
            x9 = x6 + x7;
            float f1 = Float.parseFloat(x6) * 5.2f;
            float f2 = Float.parseFloat(x7) * 7.5f;
            float f3 = f1 + f2;
            x10 = String.valueOf(f3);
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

                prepstmt2 = conn.prepareStatement("UPDATE company SET id=?,name=?,address=?,phonenum=?,linkman=? WHERE id=?");
                prepstmt2.setString(1, x1);
                prepstmt2.setString(2, x2);
                prepstmt2.setString(3, x3);
                prepstmt2.setString(4, x4);
                prepstmt2.setString(5, x5);

                prepstmt2.setString(6, x1);
                prepstmt2.executeUpdate();

                prepstmt2 = conn.prepareStatement("UPDATE ebill SET id=?,vvolume=?,pvolume=?,date=?,svolume=?,sbill=? WHERE id=? and date=?");
                prepstmt2.setString(1, x1);
                prepstmt2.setString(2, x6);
                prepstmt2.setString(3, x7);
                prepstmt2.setString(4, x8);
                prepstmt2.setString(5, x9);
                prepstmt2.setString(6, x10);

                prepstmt2.setString(7, x1);
                prepstmt2.setString(8, x8);
                prepstmt2.executeUpdate();
                JOptionPane.showMessageDialog(null, "更新成功");
                prepstmt2.close();
                conn.close();
            } catch (SQLException eb) {
                System.out.println("SQL exception occur. Message is:" + eb.getMessage());
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
