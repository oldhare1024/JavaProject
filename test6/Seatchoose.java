package test6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Seatchoose extends JFrame implements ActionListener {
    JButton[] b;
    boolean visit[];  // �Ƿ�ѡ�й�
    int seats;  // ��λ��

    Seatchoose() {
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("��̨", JLabel.CENTER);

        Scanner sc = new Scanner(System.in);
        System.out.print("��λ��:");
        seats = sc.nextInt();   // ������λ��

        p1.setLayout(new GridLayout(seats / 5, 5));
        b = new JButton[seats];
        visit = new boolean[seats];

        for (int i = 0; i < seats; i++) {
            b[i] = new JButton(String.valueOf(i + 1)); // ���� ����λ��(i+1)�� �İ�ť�������λ�Ŵ�1��ʼ
            p1.add(b[i]);// ����ťb[i]��ӵ������
            b[i].addActionListener(this); // ����ǰ����ע��Ϊb[i]��ActionEvent�¼�������
        }

        setTitle("ѡ��λ");// ���ô������Ϊ ��ѡ��λ��
        setLayout(new BorderLayout());
        setSize(800, 300); // ���ô����С
        add(l1, BorderLayout.NORTH);
        add(p1, BorderLayout.SOUTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        Seatchoose A = new Seatchoose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand(), str2;
        str2 = e.getActionCommand(); // ��ȡ��ť�Ϲ��ڡ���λ�š����ַ���
        int i = Integer.parseInt(str2);    // ����λ�š����ַ���ת��Ϊint�͵�����
        if (!visit[i - 1]) {
            b[i - 1].setEnabled(false);// ��ѡ�а�ťb[i-1]ͨ��setEnabled(boolean)���ò��ɱ༭״̬
            System.out.println(str + "��ѡ��");

            visit[i - 1] = true;
            for (int k = 0; k < seats; k++)
                if (!visit[k]) return;
            System.out.println("������λ����ѡ��");
        }
    }

}