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

    // 判断注册的账号是否符合规则
    boolean JudgeRegister() {

        if (this.name.equals("")) {
            JOptionPane.showMessageDialog(null, "用户名不能为空！", "用户名", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (this.ID.equals("")) {
            JOptionPane.showMessageDialog(null, "账号不能为空！", "账号为空", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (this.password.equals("")) {
            JOptionPane.showMessageDialog(null, "密码不能为空！", "密码为空", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!this.password.equals(this.confirmpassword)) {
            JOptionPane.showMessageDialog(null, "两次输入的密码不一致!", "密码不一致", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // 符合规则，模拟将账号添加数据库，弹出注册成功的窗口
        if (addUser()) {
            JOptionPane.showMessageDialog(null, "注册成功");
            System.out.println("添加新用户: " + ID + "," + name);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "ID已存在");
            return false;
        }
    }

    // 模拟向数据库添加新账户
    boolean addUser() {
        if (ID.equals("001"))  // ID已存在，添加失败
            return false;
        else
            return true;
    }
}
