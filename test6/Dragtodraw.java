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
        frame.setTitle("Drag to draw"); // ���ô������Ϊ"Drag to draw"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(this); // �ѵ�ǰJPanel�������ó�Ϊframe���������
        this.addMouseMotionListener(this); // ����ǰ����ע��Ϊ��������˶���������MotionListener��
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        if (xval == 0 && yval == 0) {
            super.paintComponent(g);// ��ջ�����׼�������µ�����
        } else {
            g.setColor(Color.BLUE);// ���û�����ɫΪ��ɫ
            g.fillOval(xval, yval, 2, 2); // ����Բ�㣬Բ��뾶Ϊ4����
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        xval = e.getX(); // ��ȡ����X����
        yval = e.getY();// ��ȡ����Y����
        /*
         * repaint()���ػ�component�ķ��� component�����е�ͼ�η����仯�󲻻�������ʾ����ʹ��repaint����
         */
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}