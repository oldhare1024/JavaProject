class Counter1 {
    int i = 0;
}

class Reference {
    public void plus(int i) {
        i++;
    }

    public void plus(Counter1 c) {
        c.i++;
    }

    public void create(Counter1 c) {
        c = new Counter1();
        c.i++;
    }

    public static void main(String[] args) {
        int i = 0;
        Reference r = new Reference();
        Counter1 c1 = new Counter1();
        Counter1 c2 = new Counter1();
        r.plus(i);
        System.out.print(i);
        r.plus(c1);
        System.out.print(c1.i);
        r.create(c2);
        System.out.print(c2.i);
    }
}