package java_book_example.FileIO.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReaderListen implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        System.out.println(str + ":" + str.length());
    }
}
