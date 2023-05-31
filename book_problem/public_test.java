package book_problem;

class public_test {
    private final int a;
    private final int b;

    public_test() {
        this.a = 10;
        this.b = a + 10;
    }

    void m() {
        System.out.println("¿‡public_test");
        System.out.println(a + " " + b);
        System.out.println(a);
        System.out.println(b);
    }
}

class Test {
    public static void main(String[] args) {
        public_test pt = new public_test();
        pt.m();
    }
}
