package java_book_example.FileIO.swing;

import javax.swing.*;
import java.awt.*;

public class Example9_1 {
    public static void main(String[] args) {
        JFrame window1 = new JFrame("第一个窗口");
        JFrame window2 = new JFrame("第二个窗口");
        Container con = window1.getContentPane();
        window1.setBounds(60, 100, 188, 108);
        window2.setBounds(260, 100, 188, 108);
        window1.setVisible(true);
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //释放当前窗口
        window2.setVisible(true);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //关闭所有窗口,退出程序
    }
}
