package sjk;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delect extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton b1, b2;
    private JLabel c1, name;
    private JTextField t1;
    private String x1;

    public delect() {
        super("delect");
        setSize(800, 600);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        Container container = getContentPane();
        name = new JLabel("请输入要删除企业的信息", JLabel.RIGHT);

        c1 = new JLabel("企业编号：", JLabel.RIGHT);

        b1 = new JButton("确定");
        b2 = new JButton("取消");


        t1 = new JTextField(200);

        name.setBounds(240, 10, 200, 30);

        c1.setBounds(80, 60, 100, 30);

        b1.setBounds(250, 280, 100, 25);
        b2.setBounds(450, 280, 100, 25);

        t1.setBounds(200, 60, 350, 30);

        ButtonactionPerformed buttoner = new ButtonactionPerformed();
        ButtonactionPerformed2 buttoner2 = new ButtonactionPerformed2();

        b1.addActionListener(buttoner);
        b2.addActionListener(buttoner2);

        container.add(b1);
        container.add(b2);

        container.add(name);

        container.add(t1);

        container.add(c1);

        container.setBackground(Color.lightGray);
        container.setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        delect app = new delect();
        app.setLocationRelativeTo(null);
    }

    private class ButtonactionPerformed implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String url = "jdbc:sqlserver://localhost:1433;DatabaseName=elect";
            String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String user = "sa";
            String password = "110120";
            Statement stmt;
            Connection conn;
            x1 = t1.getText();
            try {
                Class.forName(driver);
            } catch (ClassNotFoundException arg0) {
                System.out.println("class not find exception occur. Message is :");
            }
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("和数据库已经建立连接！！！");
                stmt = conn.createStatement();
                stmt.executeUpdate("delect from company where id=" + x1);
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
