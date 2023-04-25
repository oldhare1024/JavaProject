package test6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Seatchoose extends JFrame implements ActionListener {
    JButton[] b;
    boolean visit[];  // 是否被选中过
    int seats;  // 座位数

    Seatchoose() {
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("讲台", JLabel.CENTER);

        Scanner sc = new Scanner(System.in);
        System.out.print("座位数:");
        seats = sc.nextInt();   // 输入座位数

        p1.setLayout(new GridLayout(seats / 5, 5));
        b = new JButton[seats];
        visit = new boolean[seats];

        for (int i = 0; i < seats; i++) {
            b[i] = new JButton(String.valueOf(i + 1)); // 创建 “座位号(i+1)” 的按钮组件，座位号从1开始
            p1.add(b[i]);// 将按钮b[i]添加到面板上
            b[i].addActionListener(this); // 将当前窗口注册为b[i]的ActionEvent事件监视器
        }

        setTitle("选座位");// 设置窗体标题为 “选座位”
        setLayout(new BorderLayout());
        setSize(800, 300); // 设置窗体大小
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
        str2 = e.getActionCommand(); // 获取按钮上关于“座位号”的字符串
        int i = Integer.parseInt(str2);    // “座位号”的字符串转换为int型的数据
        if (!visit[i - 1]) {
            b[i - 1].setEnabled(false);// 被选中按钮b[i-1]通过setEnabled(boolean)设置不可编辑状态
            System.out.println(str + "被选中");

            visit[i - 1] = true;
            for (int k = 0; k < seats; k++)
                if (!visit[k]) return;
            System.out.println("所有座位都被选了");
        }
    }

}