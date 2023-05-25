package java_book_example.FileIO.swing;

import java.awt.*;

public class PanelDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里演示Panel");//创建一个window对象，因为容器都必须依附于window存在
        Panel p = new Panel();//创建一个panel对象
        p.add(new TextField("这是一个测试文本"));
        p.add(new Button("这里是一个测试数据"));
        //创建一个文本框和一个按钮，并且将他们放入到panel容器中
        frame.add(p);
        frame.setBounds(100, 100, 480, 320);//设置window的位置以及大小
        frame.setVisible(true);//设置window可见性
    }
}
