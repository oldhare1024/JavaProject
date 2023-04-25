package swing;


import java.awt.*;

public class BorderLayoutDemo2 {
    public static void main(String[] arg) {
        Frame frame = new Frame("这里测试BorderLayout");
        frame.setLayout(new BorderLayout(30, 10));//给frame设置BorderLayout布局管理器
        frame.add(new Button("北方按钮"), BorderLayout.NORTH);
        frame.add(new Button("南方按钮"), BorderLayout.SOUTH);
        Panel p = new Panel();
        p.add(new Button("中间按钮"));
        p.add(new TextField("测试文本框"));
        frame.add(p);
        frame.pack();
        frame.setVisible(true);
    }
}
