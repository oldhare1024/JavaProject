package java_book_example.FileIO.swing;

import javax.swing.*;
import java.awt.*;

public class WindowActionEvent1 extends JFrame {
    JTextField inputText;
    JTextArea textShow;
    JButton button;
    MyCommandListener listener;

    public WindowActionEvent1() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        inputText = new JTextField(10);
        button = new JButton("ȷ��");
        textShow = new JTextArea(9, 30);
        add(inputText);
        add(button);
        add(new JScrollPane(textShow));
    }

    void setMyCommandListener(MyCommandListener listener) {
        this.listener = listener;
        listener.setJTextField(inputText);
        listener.setJTextArea(textShow);
        inputText.addActionListener(listener);//inputText���¼�Դ��listener�Ǽ�����
        button.addActionListener(listener);//button���¼�Դ��listeners������
    }
}