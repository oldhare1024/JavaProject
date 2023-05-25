package java_book_example.FileIO.swing;

import java.awt.*;

public class GridLayoutDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame("计算器");
        Panel p = new Panel();//创建一个Panel对象，你买了存放一个TextFiled组件
        p.add(new TextField(30));//把当前这个Panel添加到frame的北边区域
        frame.add(p, BorderLayout.NORTH);//创建一个Panel对象
        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(3, 5, 4, 4));//往Panel中添加内容
        for (int i = 0; i < 10; i++) {
            p2.add(new Button(i + " "));
        }
        p2.add(new Button("+"));//加法符号
        p2.add(new Button("-"));//减法符号
        p2.add(new Button("*"));//乘法符号
        p2.add(new Button("/"));//除法符号
        p2.add(new Button("."));//小数点号
        frame.add(p2);//把当前Panel添加到Frame
        frame.pack();
        frame.setVisible(true);
    }
}
