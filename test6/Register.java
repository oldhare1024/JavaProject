package test6;

import javax.swing.*;

public class Register {
    String name;
    String ID;
    String password;
    String confirmpassword;

    void setName(String name) {
        this.name = name;
    }

    void setID(String ID) {
        this.ID = ID;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void setconfirmpasswd(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    // �ж�ע����˺��Ƿ���Ϲ���
    boolean JudgeRegister() {

        if (this.name.equals("")) {
            JOptionPane.showMessageDialog(null, "�û�������Ϊ�գ�", "�û���", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (this.ID.equals("")) {
            JOptionPane.showMessageDialog(null, "�˺Ų���Ϊ�գ�", "�˺�Ϊ��", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (this.password.equals("")) {
            JOptionPane.showMessageDialog(null, "���벻��Ϊ�գ�", "����Ϊ��", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!this.password.equals(this.confirmpassword)) {
            JOptionPane.showMessageDialog(null, "������������벻һ��!", "���벻һ��", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // ���Ϲ���ģ�⽫�˺�������ݿ⣬����ע��ɹ��Ĵ���
        if (addUser()) {
            JOptionPane.showMessageDialog(null, "ע��ɹ�");
            System.out.println("������û�: " + ID + "," + name);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ID�Ѵ���");
            return false;
        }
    }

    // ģ�������ݿ�������˻�
    boolean addUser() {
        if (ID.equals("001"))  // ID�Ѵ��ڣ����ʧ��
            return false;
        else
            return true;
    }
}
