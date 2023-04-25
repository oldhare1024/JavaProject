package test6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Dragtodraw extends JPanel implements MouseMotionListener {
    int xval = 0, yval = 0;
    JFrame frame;

    public static void main(String[] args) {
        Dragtodraw A = new Dragtodraw();
        A.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setSize(300, 200);
        frame.setTitle("Drag to draw"); // 设置窗体标题为"Drag to draw"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(this); // 把当前JPanel对象设置成为frame的内容面板
        this.addMouseMotionListener(this); // 将当前对象注册为它的鼠标运动监听器（MotionListener）
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        if (xval == 0 && yval == 0) {
            super.paintComponent(g);// 清空画布并准备绘制新的内容
        } else {
            g.setColor(Color.BLUE);// 设置画笔颜色为蓝色
            g.fillOval(xval, yval, 2, 2); // 绘制圆点，圆点半径为4像素
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xval = e.getX(); // 获取鼠标的X坐标
        yval = e.getY();// 获取鼠标的Y坐标
        /*
         * repaint()是重绘component的方法 component中已有的图形发生变化后不会立刻显示，须使用repaint方法
         */
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}