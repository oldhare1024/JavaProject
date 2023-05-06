package rjgc_login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView extends JPanel implements ActionListener {
    Register register;
    JTextField inputID, inputBirth;
    JPasswordField inputPassword;
    JButton buttonRegister;

    RegisterView() {
        register = new Register();
        inputID = new JTextField(12);
        inputPassword = new JPasswordField(12);
        inputBirth = new JTextField(12);
        buttonRegister = new JButton("ע��");
        add(new JLabel("�˺ţ�"));
        add(inputID);
        add(new JLabel("���룺"));
        add(inputPassword);
        add(new JLabel("��������(****-**-**):"));
        add(inputBirth);
        add(buttonRegister);
        buttonRegister.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        register.setID(inputID.getText());
        char[] pw = inputPassword.getPassword();
        register.setPassword(new String(pw));
        register.setBirth(inputBirth.getText());
        HandleInsertData handleRegister = new HandleInsertData();
        handleRegister.writeRegisterModel(register);
    }
}
