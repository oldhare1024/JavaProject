//B��̳�A��
public class constructor extends A {
    //B���εĹ��췽��
    constructor(String name) {
        super("bad");
        System.out.println("B-->" + name);
    }

    public static void main(String[] args) {
        constructor c = new constructor("good");
    }
}

//����A��
class A {
    //A�޲εĹ��췽��
    A() {
        System.out.println("A��-->A()");
    }

    //A���εĹ��췽��
    A(String name) {
        System.out.println("A-->" + name);
    }
}