package swing;


import java.awt.*;

public class BorderLayoutDemo2 {
    public static void main(String[] arg) {
        Frame frame = new Frame("�������BorderLayout");
        frame.setLayout(new BorderLayout(30, 10));//��frame����BorderLayout���ֹ�����
        frame.add(new Button("������ť"), BorderLayout.NORTH);
        frame.add(new Button("�Ϸ���ť"), BorderLayout.SOUTH);
        Panel p = new Panel();
        p.add(new Button("�м䰴ť"));
        p.add(new TextField("�����ı���"));
        frame.add(p);
        frame.pack();
        frame.setVisible(true);
    }
}
