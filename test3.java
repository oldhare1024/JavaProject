import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        System.out.println("���������鳤�ȣ�");
        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        int[] array = new int[x];
        int i;
        for (i = 0; i < x; i++) {
            int num = (int) (Math.random() * 100);
            array[i] = num;
        }
        for (i = 0; i < x; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (i = 0; i < x; i++) {
            sum += array[i];
        }
        System.out.println("����Ԫ��֮��Ϊ��" + sum);
        int max = array[0];
        for (i = 0; i < x - 1; i++) {
            if (array[i] < array[i + 1])
                max = array[i + 1];
        }
        System.out.println("���������ֵΪ��" + max);
    }
}
