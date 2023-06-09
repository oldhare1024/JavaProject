package sort;

import java.util.Arrays;
import java.util.Scanner;

public class quicksort {
    public int len;
    public int[] arr;

    quicksort(int len, int[] arr) {
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
        quicksort qs = new quicksort(len, arr);
        qs.qsort(qs.arr, 0, qs.arr.length - 1);
        System.out.println(Arrays.toString(qs.arr));
    }

    public void swap(int[] num, int a, int b) {
        if (a != b) {//判断两下标是否相等指向同一元素，否则相同值异或结果为0
            num[a] = num[a] ^ num[b];
            num[b] = num[b] ^ num[a];
            num[a] = num[a] ^ num[b];
        }
    }

    public void qsort(int[] num, int low, int high) {
        if (low >= high)
            return;
        int t = num[low];//取第一位数字为基准
        int i = low, j = high;
        while (i != j) {
            while (i < j && num[j] >= t)//高指针向左查询比基准小的数
                --j;
            swap(num, i, j);
            while (i < j && num[i] <= t)//低指针向右查询比基准大的数
                ++i;
            swap(num, i, j);
        }//重合时跳出循环，更换基准位置
        qsort(num, low, i - 1);
        qsort(num, i + 1, high);
    }
}
