package swing;

import java.awt.event.*;
import javax.swing.*;

public interface MyCommandListener extends ActionListener {
    public void setJTextField(JTextField text);

    public void setJTextArea(JTextArea area);
}
