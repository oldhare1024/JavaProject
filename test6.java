import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int i, n, sum;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sum = 0;
        for (i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        sum = 0;
        i = 0;
        while (i < n) {
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
    }
}
