package java_book_example.FileIO.swing;

import javax.swing.*;
import java.awt.*;

public class ComponentInWindow extends JFrame {
    JCheckBox checkBox1, checkBox2;//复选框
    JRadioButton radioM, radioF;//单选框
    ButtonGroup group;
    JComboBox<String> comBox;//下拉列表

    public ComponentInWindow() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        comBox = new JComboBox<>();
        checkBox1 = new JCheckBox("喜欢音乐");
        checkBox2 = new JCheckBox("喜欢旅游");
        group = new ButtonGroup();
        radioM = new JRadioButton("男");
        radioF = new JRadioButton("女");
        group.add(radioM);
        group.add(radioF);
        add(checkBox1);
        add(checkBox2);
        add(radioM);
        add(radioF);
        comBox.addItem("音乐天地");
        comBox.addItem("武术天地");
        add(comBox);
    }
}
