package sjk;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class search extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JButton b1;
    private final JLabel c1, c2;
    private final JTextArea t1, t2;
    private String x1, x2;

    public search() {
        super("search");
        setSize(600, 320);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
        }
        Container container = getContentPane();

        c1 = new JLabel("谷电价：", JLabel.RIGHT);
        c2 = new JLabel("峰电价：", JLabel.RIGHT);

        b1 = new JButton("查询");

        t1 = new JTextArea();
        t2 = new JTextArea();

        b1.setBounds(250, 200, 80, 25);

        c1.setBounds(80, 60, 100, 30);
        c2.setBounds(320, 60, 100, 30);

        t1.setBounds(200, 60, 100, 30);
        t2.setBounds(440, 60, 100, 30);

        ButtonactionPerformed buttoner = new ButtonactionPerformed();
        b1.addActionListener(buttoner);
        container.add(b1);

        container.add(t1);
        container.add(t2);

        container.add(c1);
        container.add(c2);

        container.setBackground(Color.lightGray);
        container.setLayout(null);

        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        search app = new search();
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
            try {
                conn = DriverManager.getConnection(url, user, password);
                conn.setAutoCommit(true);
                System.out.println("和数据库已经建立连接！！！");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("select * from eprice");
                while (rs.next()) {
                    x1 = rs.getString(1);
                    x2 = rs.getString(2);
                    t1.append(x1);
                    t2.append(x2);
                }
                JOptionPane.showMessageDialog(null, "查询成功");
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException eb) {
                System.out.println("SQL exception occur. Message is:" + eb.getMessage());
                System.out.println(eb.getMessage());
            }
        }
    }
}
