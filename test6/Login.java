package test6;

/*
处理用户登录
*/

public class Login {

    User user;

    void setUser(User user) {
        this.user = user;
    }

    /*
     * JudgeUser()方法 判断User的ID和密码是否正确，如果正确，显示登录成功；如果错误，弹出一个窗口，显示账号或密码错误
     */
    public boolean login(User user) {
        if (user.getID().equals("001") && user.getPassword().equals("1234")) {
            user.setName("Tom");
            return true;
        } else
            return false;
    }

    int JudgeUser() {
        if (login(this.user)) {
            System.out.println("登录成功");
            return 1;
        } else {
            return 0;
        }
    }
}
