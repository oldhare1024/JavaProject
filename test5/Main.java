package test5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "��ѧ87.0�֣�����76.0�֣�Ӣ��96.0��";
        Scanner scanner = new Scanner(System.in); //ʹ�ù��췽��Scanner(String str)����scanner
        String regex = "[^0123456789.]+";
        scanner.useDelimiter(regex); /*scanner����useDelimiter(String regex)*/
        double sum=0; int i=0;
        while(scanner.hasNext()){
            try{
                double score = scanner.nextDouble(); //scanner����nextDouble()�������ֵ���
                sum = sum+score; i++;
                System.out.println(score);
            }
            catch(InputMismatchException exp){
                String t = scanner.next();
            }
        }
        System.out.printf("%.2f\n",sum);//����ܷ�
        System.out.printf("%.2f",sum/i);//���ƽ����
    }
}
