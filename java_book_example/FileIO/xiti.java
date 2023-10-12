package java_book_example.FileIO;

public class xiti {
    public static void main(String[] args) {
        int n = 1;
        long sum = 0;
        while (sum < 8888) {
            sum = sum + n;
            n++;
        }
        System.out.println("满足条件的最大整数:" + (n - 1));
        double a = 1.001;
        System.out.printf("%.2f", a);
    }
}
