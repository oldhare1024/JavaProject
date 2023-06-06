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
        //gap�ǲ�����ָ�·ֳɵ�����������Ԫ�ص�������ֵ��ÿ�λ��Ϊԭ����һ��
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //��ԭ�����Ϊgap���飬��ÿ��Ԫ�طֱ����ֱ�Ӳ������򣬹�ѭ��gap��
            for (int i = 0; i < gap; i++) {
                //�������ɵ��������ֱ�Ӳ�������
                for (int j = i + gap; j < arr.length; j += gap) {
                    //��������Ԫ�ز��뵽ǰ����������ĺ���λ�á���������������ֻ������Ԫ��
                    if (arr[j] < arr[j - gap]) {
                        int temp = arr[j];             //��������Ԫ�ط�����ʱ������
                        int k = j - gap;                 //��������������һ��Ԫ��������ֵ������k
                        while (k >= 0 && arr[k] > temp) {    //ѭ�����Һ��ʵĲ���λ�ã���������Ԫ�غ���һλ
                            arr[k + gap] = arr[k];
                            k -= gap;
                        }
                        arr[k + gap] = temp;             //��Ԫ�ز��뵽�������λ��
                    }
                }
            }
        }
    }
}
