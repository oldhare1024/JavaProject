package java_book_example.FileIO.swing;

import java.awt.*;

public class GridLayoutDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("������");
        Panel p = new Panel();//����һ��Panel���������˴��һ��TextFiled���
        p.add(new TextField(30));//�ѵ�ǰ���Panel��ӵ�frame�ı�������
        frame.add(p, BorderLayout.NORTH);//����һ��Panel����
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3, 5, 4, 4));//��Panel���������
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i + " "));
        }
        p2.add(new Button("+"));//�ӷ�����
        p2.add(new Button("-"));//��������
        p2.add(new Button("*"));//�˷�����
        p2.add(new Button("/"));//��������
        p2.add(new Button("."));//С�����
        frame.add(p2);//�ѵ�ǰPanel��ӵ�Frame
        frame.pack();
        frame.setVisible(true);
    }
}
