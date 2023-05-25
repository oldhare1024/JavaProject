package java_book_example.FileIO.rjgc_login;

public class Cheshi {
    public static void main(String[] args) {
        Register user = new Register();
        user.setID("moonjava");
        user.setPassword("123456");
        user.setBirth("1999-12-10");
        HandleInsertData handleRegister = new HandleInsertData();
        handleRegister.writeRegisterModel(user);
        Login login = new Login();
        login.setID("moonjava");
        login.setPassword("123456");
        HandleLogin handleLogin = new HandleLogin();
        login = handleLogin.queryVerify(login);
        if (login.getLoginSuccess()) {
            System.out.println("µÇÂ¼³É¹¦£¡");
        }
    }
}
