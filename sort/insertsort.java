package sort;

import java.util.Arrays;
import java.util.Scanner;

public class insertsort {
    public int len;
    public int[] arr;

    insertsort(int len, int[] arr) {
        this.len = len;
        this.arr = arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len;
        int[] arr;
        len = sc.nextInt();
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        insertsort is = new insertsort(len, arr);
        is.isort();
        System.out.println(Arrays.toString(is.arr));
    }

    public void isort() {
        int i, j;
        for (i = 1; i < len; i++) {
            int t = arr[i];
            int insertindex = binarysearch(i);
            for (j = i; j > insertindex; j--) {
                arr[j] = arr[j - 1];
            }
            arr[insertindex] = t;
        }
    }

    public int binarysearch(int index) {
        int lt = 0, rt = index;
        while (lt < rt) {
            int mid = (lt + rt) >> 1;
            if (arr[index] < arr[mid])
                rt = mid;
            else
                lt = mid + 1;
        }
        return lt;
    }
}
