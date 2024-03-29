package sjk;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.*;

public class create extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JButton b1, b2;
    private final JLabel c1, c2, c3, c4, c5, name;
    private final JTextField t1, t2, t3, t4, t5, search;
    private String corpname, x1, x2, x3, x4, x5, x6;

    public create() {
        super("create");
        setSize(800, 600);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        Container container = getContentPane();
        name = new JLabel("请输入企业编号: ", JLabel.RIGHT);

        c1 = new JLabel("谷电量：", JLabel.RIGHT);
        c2 = new JLabel("峰电量：", JLabel.RIGHT);
        c3 = new JLabel("年月份：", JLabel.RIGHT);
        c4 = new JLabel("合计电量：", JLabel.RIGHT);
        c5 = new JLabel("企业用电费：", JLabel.RIGHT);

        b1 = new JButton("查询");
        b2 = new JButton("生成电费单");


        t1 = new JTextField(200);
        t2 = new JTextField(200);
        t3 = new JTextField(200);
        t4 = new JTextField(200);
        t5 = new JTextField(200);

        search = new JTextField(60);

        name.setBounds(50, 30, 130, 30);
        search.setBounds(300, 30, 100, 30);

        c1.setBounds(80, 60, 100, 30);
        c2.setBounds(80, 90, 100, 30);
        c3.setBounds(80, 120, 100, 30);
        c4.setBounds(60, 150, 120, 30);
        c5.setBounds(80, 180, 100, 30);

        b1.setBounds(250, 230, 80, 25);
        b2.setBounds(350, 230, 120, 25);

        t1.setBounds(300, 60, 100, 30);
        t2.setBounds(300, 90, 100, 30);
        t3.setBounds(300, 120, 100, 30);
        t4.setBounds(300, 150, 100, 30);
        t5.setBounds(300, 180, 100, 30);

        ButtonactionPerformed buttoner = new ButtonactionPerformed();
        ButtonactionPerformed2 buttoner2 = new ButtonactionPerformed2();

        b1.addActionListener(buttoner);
        b2.addActionListener(buttoner2);

        container.add(b1);
        container.add(b2);

        container.add(name);
        container.add(search);

        container.add(t1);
        container.add(t2);
        container.add(t3);
        container.add(t4);
        container.add(t5);

        container.add(c1);
        container.add(c2);
        container.add(c3);
        container.add(c4);
        container.add(c5);

        container.setBackground(Color.lightGray);
        container.setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        create app = new create();
        app.setLocationRelativeTo(null);
    }

    private class ButtonactionPerformed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect;encrypt=true;trustServerCertificate=true;";
            String user = "sa";
            String password = "110120";
            Connection conn;
            Statement stmt;
            ResultSet rs;
            corpname = search.getText();
            x1 = t1.getText();
            x2 = t2.getText();
            x3 = t3.getText();
            x4 = t4.getText();
            x5 = t5.getText();
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("和数据库已经建立连接！！！");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select * from ebill");
                while (rs.next()) {
                    if (rs.getString(1).equals(corpname)) {
                        x1 = rs.getString(2);
                        x2 = rs.getString(3);
                        x3 = rs.getString(4);
                        x4 = rs.getString(5);
                        x5 = rs.getString(6);
                        t1.setText(x1);
                        t2.setText(x2);
                        t3.setText(x3);
                        t4.setText(x4);
                        t5.setText(x5);
                    }
                }
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException eb) {
                System.out.println("SQL exception occur. Message is:" + eb.getMessage());
                System.out.println(eb.getMessage());
            }
        }
    }

    private class ButtonactionPerformed2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                x6 = search.getText();
                PrintWriter f = new PrintWriter("电费单.txt");

                f.println("  " + x6 + "号企业电费单  ");
                f.println("  谷电量：" + x1);
                f.println("  峰电量：" + x2);
                f.println("  合计电量：" + x3);
                f.println("  年月份：" + x4);
                f.println("  企业用电费：" + x5);
                JOptionPane.showMessageDialog(null, "打印成功");
                f.close();
            } catch (FileNotFoundException e) {
                System.out.println("发生异常");
            }
        }
    }
}
