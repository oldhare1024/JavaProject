package swing;

import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] arg) {
        Frame frame = new Frame("这里测试BorderLayout");
        frame.setLayout(new BorderLayout(30, 10));//给frame设置BorderLayout布局管理器
        frame.add(new Button("北方按钮"), BorderLayout.NORTH);
        frame.add(new Button("南方按钮"), BorderLayout.SOUTH);
        frame.add(new Button("东方按钮"), BorderLayout.EAST);
        frame.add(new Button("西方按钮"), BorderLayout.WEST);
        //给frame的五个指定方向添加组件
        frame.add(new TextField("测试文本框"));
        frame.pack();
        frame.setVisible(true);
    }
}
