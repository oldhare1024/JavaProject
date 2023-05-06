package rjgc_login;

public class Login {
    boolean loginSuccess = false;
    String id;
    String password;

    public void setID(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(boolean bo) {
        loginSuccess = bo;
    }
}
