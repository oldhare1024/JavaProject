package java_book_example.FileIO.swing;

import java.awt.*;

public class ScrollPaneDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试ScrollPane");
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);//创建ScrollPane窗口对象
        sp.add(new TextField("这是测试文本"));
        sp.add(new Button("这是测试按钮"));
        frame.add(sp);//把ScrollPane添加到Frame中
        frame.setBounds(100, 100, 400, 200);
        frame.setVisible(true);

    }
}
