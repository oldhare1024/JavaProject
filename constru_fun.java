public class constru_fun {
    int a, len;

    constru_fun() {
        len = 10;
        a = 20;
    }
}

class fun1 {
    public static void main(String[] args) {
        constru_fun construfun = new constru_fun();
        System.out.println(construfun.a);
        System.out.println(construfun.len);
    }
}