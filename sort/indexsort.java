package sort;

import java.util.Scanner;

public class indexsort {
    public int len;
    public int[] arr;
    public int[] arr2;

    indexsort(int len, int[] arr, int[] arr2) {
        this.len = len;
        this.arr = arr;
        this.arr2 = arr2;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int min;
        int max = 0;
        int offset;
        int len;
        int[] arr;
        int[] arr2;
        len = sc.nextInt();
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        min = arr[0];
        for (int i = 0; i < len; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        offset = max - min + 1;
        arr2 = new int[offset];
        indexsort is1 = new indexsort(len, arr, arr2);
        is1.isort1(offset, min);
    }

    public void isort1(int len2, int diff) {
        for (int i = 0; i < len; i++) {
            arr2[arr[i] - diff] += 1;
        }
        for (int i = 0; i < len2; i++) {
            while (arr2[i] >= 1) {
                System.out.print(i + diff + " ");
                arr2[i]--;
            }
        }
    }
}
