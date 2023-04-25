package swing;

import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] arg) {
        Frame frame = new Frame("�������BorderLayout");
        frame.setLayout(new BorderLayout(30, 10));//��frame����BorderLayout���ֹ�����
        frame.add(new Button("������ť"), BorderLayout.NORTH);
        frame.add(new Button("�Ϸ���ť"), BorderLayout.SOUTH);
        frame.add(new Button("������ť"), BorderLayout.EAST);
        frame.add(new Button("������ť"), BorderLayout.WEST);
        //��frame�����ָ������������
        frame.add(new TextField("�����ı���"));
        frame.pack();
        frame.setVisible(true);
    }
}
