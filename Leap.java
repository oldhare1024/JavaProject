import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if (a % 4 == 0 && a % 100 != 0)
            System.out.println("������");
        else if (a % 400 == 0)
            System.out.println("������");
        else
            System.out.println("��������");
        scanner.close();
    }
}