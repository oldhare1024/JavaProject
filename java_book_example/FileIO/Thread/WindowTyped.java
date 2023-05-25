package java_book_example.FileIO.Thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowTyped extends JFrame implements ActionListener, Runnable {
    JTextField inputLetter;
    Thread giveLetter;
    JLabel showLetter, showScore;
    int sleeptime, score;

    WindowTyped() {
        //setSize(800,600);û��Ӧ�����flowlayout������ô���ô��ڣ���ǩλ��
        setLayout(new FlowLayout());
        giveLetter = new Thread(this);
        inputLetter = new JTextField(6);
        showLetter = new JLabel(" ", JLabel.CENTER);
        showScore = new JLabel("������");
        showLetter.setFont(new Font("Arial", Font.BOLD, 22));
        add(new JLabel("��ʾ��ĸ��"));
        add(showLetter);
        add(new JLabel("��������ʾ����ĸ���س���"));
        add(inputLetter);
        add(showScore);
        inputLetter.addActionListener(this);
        setBounds(100, 100, 400, 280);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        giveLetter.start();
    }

    public void run() {
        char c = 'a';
        while (true) {
            showLetter.setText("" + c + " ");
            validate();
            c = (char) (c + 1);
            if (c > 'z')
                c = 'a';
            try {
                Thread.sleep(sleeptime);
            } catch (InterruptedException e) {
            }
        }
    }

    public void setSleepTime(int n) {
        sleeptime = n;
    }

    public void actionPerformed(ActionEvent e) {
        String s = showLetter.getText().trim();
        String letter = inputLetter.getText().trim();
        if (s.equals(letter)) {
            score++;
            showScore.setText("�÷�" + score);
            inputLetter.setText(null);
            validate();
            giveLetter.interrupt();
        }
    }
}
