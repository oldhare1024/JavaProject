package swing;

import java.awt.*;
import javax.swing.*;

public class ComponentInWindow extends JFrame {
    JCheckBox checkBox1, checkBox2;//��ѡ��
    JRadioButton radioM, radioF;//��ѡ��
    ButtonGroup group;
    JComboBox<String> comBox;//�����б�

    public ComponentInWindow() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        comBox = new JComboBox<>();
        checkBox1 = new JCheckBox("ϲ������");
        checkBox2 = new JCheckBox("ϲ������");
        group = new ButtonGroup();
        radioM = new JRadioButton("��");
        radioF = new JRadioButton("Ů");
        group.add(radioM);
        group.add(radioF);
        add(checkBox1);
        add(checkBox2);
        add(radioM);
        add(radioF);
        comBox.addItem("�������");
        comBox.addItem("�������");
        add(comBox);
    }
}
