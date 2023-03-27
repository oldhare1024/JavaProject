public class overload {
    public static int s_two(int a, int b) {
        return a + b;
    }

    public static int s_three(int a, int b, int c) {
        return a + b + c;
    }

    public static int s_four(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4, x = s_two(A, B), y = s_three(A, B, C), z = s_four(A, B, C, D);
        System.out.println(x + " " + y + " " + z);
    }
}
