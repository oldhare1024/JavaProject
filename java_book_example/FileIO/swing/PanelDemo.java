package java_book_example.FileIO.swing;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("������ʾPanel");//����һ��window������Ϊ����������������window����
        Panel p = new Panel();//����һ��panel����
        p.add(new TextField("����һ�������ı�"));
        p.add(new Button("������һ����������"));
        //����һ���ı����һ����ť�����ҽ����Ƿ��뵽panel������
        frame.add(p);
        frame.setBounds(100, 100, 480, 320);//����window��λ���Լ���С
        frame.setVisible(true);//����window�ɼ���
    }
}
