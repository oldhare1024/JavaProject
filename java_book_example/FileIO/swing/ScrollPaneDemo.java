package java_book_example.FileIO.swing;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("�������ScrollPane");
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);//����ScrollPane���ڶ���
        sp.add(new TextField("���ǲ����ı�"));
        sp.add(new Button("���ǲ��԰�ť"));
        frame.add(sp);//��ScrollPane��ӵ�Frame��
        frame.setBounds(100, 100, 400, 200);
        frame.setVisible(true);

    }
}
