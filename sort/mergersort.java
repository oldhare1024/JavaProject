package sort;

import java.util.Arrays;
import java.util.Scanner;

public class mergersort {
    public int len;
    public int[] arr;

    mergersort(int len, int[] arr) {
        this.len = len;
        this.arr = arr;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int len;
        int[] arr;
        len = sc.nextInt();
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        mergersort ms = new mergersort(len, arr);
        int[] mergerarr = ms.msort(arr);
        System.out.println(Arrays.toString(mergerarr));
    }

    public int[] msort(int[] subarr) {
        int[] arr = Arrays.copyOf(subarr, subarr.length);
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merger(msort(left), msort(right));
    }

    public int[] merger(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }
        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }
        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }
        return result;
    }
}
