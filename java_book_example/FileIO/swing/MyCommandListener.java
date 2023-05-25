package java_book_example.FileIO.swing;

import javax.swing.*;
import java.awt.event.ActionListener;

public interface MyCommandListener extends ActionListener {
    public void setJTextField(JTextField text);

    public void setJTextArea(JTextArea area);
}
