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
        listener = new ReaderListen();//创建监视器
        text.addActionListener(listener);//text将listenter注册为自己的监视器
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
