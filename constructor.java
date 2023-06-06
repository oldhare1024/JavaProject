//B类继承A类
public class constructor extends A {
    //B带参的构造方法
    constructor(String name) {
        super("bad");
        System.out.println("B-->" + name);
    }

    public static void main(String[] args) {
        constructor c = new constructor("good");
    }
}

//创建A类
class A {
    //A无参的构造方法
    A() {
        System.out.println("A类-->A()");
    }

    //A带参的构造方法
    A(String name) {
        System.out.println("A-->" + name);
    }
}