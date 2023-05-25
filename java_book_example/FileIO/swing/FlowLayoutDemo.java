package java_book_example.FileIO.swing;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这里测试FlowLayout");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));//通过setLayout方法设置容器的布局管理器
        for (int i = 0; i < 10; i++) {
            frame.add(new Button("按钮" + i));//添加多个按钮到frame中
        }
        frame.pack();//设置最佳大小，pack方法
        frame.setVisible(true);
    }
}
