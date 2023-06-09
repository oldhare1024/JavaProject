package sort;

import java.util.Arrays;
import java.util.Scanner;

public class radixsort {
    public int len;
    public int[] arr;

    radixsort(int len, int[] arr) {
        this.len = len;
        this.arr = arr;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int len;
        int[] arr;
        len = sc.nextInt();
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i])
                max = arr[i];
        }
        radixsort rs = new radixsort(len, arr);
        int n = String.valueOf(max).length();
        rs.rsort(n);
        System.out.println(Arrays.toString(rs.arr));
    }

    public void rsort(int n) {
        int radix = 10;//ÿһλ���ַ�Χ0~9һ��10��ֵ
        int[] arr2 = new int[arr.length];
        int[] count = new int[radix];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(count, 0);//ÿ��ѭ����ʼ��count����
            for (int j = 0; j < len; j++) {
                count[getdigit(arr[j], i)]++;
            }
            for (int j = 1; j < radix; j++) {
                count[j] += count[j - 1];//ǰ׺���������ĸ�Ԫ��λ��
            }
            for (int j = len - 1; j >= 0; j--) {//��ͬλ��ǰ׺���ɴ�С�Լ�������Ҫ����������飬����ȳ�
                arr2[count[getdigit(arr[j], i)] - 1] = arr[j];
                if (count[getdigit(arr[j], i)] != 0)
                    count[getdigit(arr[j], i)]--;
            }
            arr = Arrays.copyOf(arr2, arr2.length);
        }
    }

    public int getdigit(int num, int n) {
        /*num=9876,n=3
        //return num%1000/100;
        //return num%(10^n)/(n-1);
        ��num�ĵ�nλ������*/
        if (num < 10) {
            return num;
        } else {
            return (num / (int) Math.pow(10, n - 1) % 10);
        }
    }
}
