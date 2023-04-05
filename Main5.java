public class Main5 {
    public static void main(String[] args) {
        Child kid1 = new Child1(), kid2 = new Child2();
        kid1.say();
        kid2.say();
    }
}

class Child {
    public void say() {
        System.out.print("Hi!");
    }
}

class Child1 extends Child {
    public void say() {
        System.out.print("Bingo!");
    }
}

class Child2 extends Child {
    public void say() {
        System.out.print("OK!");
    }
}