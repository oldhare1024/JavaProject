package java_book_example.FileIO.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class WindowActionEvent extends JFrame {
    JTextField text;
    ActionListener listener;

    public WindowActionEvent() {
        setLayout(new FlowLayout());
        text = new JTextField(10);
        add(text);
        listener = new ReaderListen();//����������
        text.addActionListener(listener);//text��listenterע��Ϊ�Լ��ļ�����
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
