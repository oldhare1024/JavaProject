package sort;

import java.util.Arrays;
import java.util.Scanner;

public class shellsort {
    public int len;
    public int[] arr;

    shellsort(int len, int[] arr) {
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
        shellsort ss = new shellsort(len, arr);
        ss.ssort();
        System.out.println(Arrays.toString(ss.arr));
    }

    public void ssort() {
        //gap是步长，指新分成的数组中相邻元素的索引差值；每次会减为原来的一半
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //将原数组分为gap个组，对每组元素分别进行直接插入排序，共循环gap次
            for (int i = 0; i < gap; i++) {
                //对新生成的数组进行直接插入排序
                for (int j = i + gap; j < arr.length; j += gap) {
                    //将待排序元素插入到前面有序数组的合适位置。初次排序数组中只有两个元素
                    if (arr[j] < arr[j - gap]) {
                        int temp = arr[j];             //将待插入元素放入临时变量中
                        int k = j - gap;                 //将有序数组的最后一个元素索引赋值给变量k
                        while (k >= 0 && arr[k] > temp) {    //循环查找合适的插入位置，并将数组元素后移一位
                            arr[k + gap] = arr[k];
                            k -= gap;
                        }
                        arr[k + gap] = temp;             //将元素插入到数组合适位置
                    }
                }
            }
        }
    }
}
