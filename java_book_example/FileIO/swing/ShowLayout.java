package java_book_example.FileIO.swing;

import javax.swing.*;
import java.awt.*;

public class ShowLayout extends JFrame {
    PanelGridLayout pannelGrid;
    PanelNullLayout panelNull;
    JTabbedPane p;

    ShowLayout() {
        pannelGrid = new PanelGridLayout();
        panelNull = new PanelNullLayout();
        p = new JTabbedPane();
        p.add("���񲼾ֵ����", pannelGrid);
        p.add("�ղ��ֵ����", panelNull);
        add(p, BorderLayout.CENTER);
        add(new JButton("������BorderLayout����"), BorderLayout.NORTH);
        add(new JButton("��"), BorderLayout.SOUTH);
        add(new JButton("��"), BorderLayout.WEST);
        add(new JButton("��"), BorderLayout.EAST);
        setBounds(10, 10, 570, 390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate();
    }
}
