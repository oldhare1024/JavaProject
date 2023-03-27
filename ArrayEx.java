import java.util.Random;
import java.util.Scanner;

class ArrayEx {
    public static void main(String[] args) {
        int i, n,k = 0, sum = 0, max;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        int[] arr = new int[n];
        Random r = new Random();
        for (i = 0; i < n; i++) {
            arr[i] = r.nextInt(101);
            sum += arr[i];
        }
        max = arr[0];
        for (i = 0; i < n; i++) {
            if (i % 5 == 0) {
                System.out.println("\n");
            }
            System.out.print(arr[i] + " ");
        }
        for (i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
                k = i;
            }
        }
        k+=1;
        System.out.println("\n");
        System.out.println("数组元素之和为" + sum);
        System.out.println("最大值为" + max + "位置为" + k);
    }
}