class EX {
    static void Proc(int sel) {
        try {
            if (sel == 0) {
                System.out.print("NoException;");
            } else if (sel == 1) {
                int a = 0;
                int b = 9 / a;
            }
        } catch (ArithmeticException e) {
            System.out.print("Catch1");
            return;
        } catch (Exception e) {
            System.out.print("Catch2");
            return;
        } finally {
            System.out.print("finally");
        }
        System.out.print("End");
    }
}

class Test {
    public static void main(String[] args) {
        EX.Proc(0);
        EX.Proc(1);
    }
}