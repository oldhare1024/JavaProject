package sort;

import java.util.Arrays;
import java.util.Scanner;

public class buddlesort {
    public int n;
    public int[] arr;

    public void setN(int n) {
        this.n = n;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void bsort() {
        int i, j;
        int lastpos = 0;
        int k = n - 1;
        for (i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (j = 0; j < k; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j + 1] ^ arr[j];
                    arr[j] = arr[j] ^ arr[j + 1];
                    flag = false;
                    lastpos = j;
                }
            }
            if (flag)
                break;
            else
                k = lastpos;
        }
    }
}

class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        buddlesort bs = new buddlesort();

        int n = sc.nextInt();
        int[] arr = new int[n];

        bs.setN(n);
        bs.setArr(arr);

        for (int i = 0; i < bs.arr.length; i++)
            bs.arr[i] = sc.nextInt();

        try {
            bs.bsort();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(bs.arr));
    }
}
