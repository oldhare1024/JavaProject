package java_book_example.FileIO.swing;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("�������FlowLayout");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));//ͨ��setLayout�������������Ĳ��ֹ�����
        for (int i = 0; i < 10; i++) {
            frame.add(new Button("��ť" + i));//��Ӷ����ť��frame��
        }
        frame.pack();//������Ѵ�С��pack����
        frame.setVisible(true);
    }
}
