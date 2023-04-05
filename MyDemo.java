class Outer {
    private class Inner {
        public void show() {
            System.out.println("Secret!");
        }
    }
    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner();
        inner.show();
    }
}