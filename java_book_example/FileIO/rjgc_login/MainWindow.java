package java_book_example.FileIO.rjgc_login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {
    JButton computerButton;
    RegisterAndLoginView view;

    MainWindow() {
        setBounds(100, 100, 640, 480);
        view = new RegisterAndLoginView();
        computerButton = new JButton("���ݵ�");
        computerButton.addActionListener(this);
        add(view, BorderLayout.CENTER);
        add(computerButton, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow window = new MainWindow();
        window.setTitle("��½������桰���ݵ���");
    }

    public void actionPerformed(ActionEvent e) {
        if (!view.isLoginSuccess()) {
            JOptionPane.showMessageDialog(null, "���¼", "��¼��ʾ", JOptionPane.WARNING_MESSAGE);
        } else {
            System.out.println("��Ϸ��ʼ");
        }
    }
}
