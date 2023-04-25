package test6;

public class User {
    private String id; // 编号
    private String name; // 姓名
    private String password; // 密码

    String getID() {
        return this.id;
    }

    void setID(String id) {
        this.id = id;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getPassword() {
        return this.password;
    }

    void setPassword(String password) {
        this.password = password;
    }/*3个实例变量的Set系列方法*/
    /*3个实例变量的Get系列方法*/
}
