package sort;

import java.util.Arrays;
import java.util.Scanner;

public class selectsort {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a;
        int[] b;
        a = sc.nextInt();
        b = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        Insertsort(a, b);
        System.out.println(Arrays.toString(b));
        sc.close();
    }

    public static void Insertsort(int len, int[] arr) {
        int minnum, minpos;
        int maxnum, maxpos;

        for (int i = 0; i < len / 2; i++) {
            minnum = arr[i];
            minpos = i;

            maxnum = arr[i];
            maxpos = i;

            for (int j = i; j < len - i - 1; j++) {
                if (minnum > arr[j + 1]) {
                    minnum = arr[j + 1];
                    minpos = j + 1;
                }// 查找最小值并交换

                if (maxnum < arr[j + 1]) {
                    maxnum = arr[j + 1];
                    maxpos = j + 1;
                }// 查找最大值并交换
            }
            arr[minpos] = arr[i];
            arr[i] = minnum;

            if (maxpos == i)
                maxpos = minpos;
            //当一次内循环，交换的两个值分别为最大值和最小值时，需要更新交换完最小值后，最大值的位置
            arr[maxpos] = arr[len - i - 1];
            arr[len - i - 1] = maxnum;

            System.out.println(Arrays.toString(arr));
        }
    }

}