package sort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MonkeySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("原始数组: " + Arrays.toString(arr));

        long startTime = System.currentTimeMillis();
        monkeySort(arr);
        long endTime = System.currentTimeMillis();

        System.out.println("猴子排序后的数组: " + Arrays.toString(arr));
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
    }

    public static void monkeySort(int[] arr) {
        while (!isSorted(arr)) {
            shuffle(arr);
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    private static void shuffle(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}