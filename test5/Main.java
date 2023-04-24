package test5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "数学87.0分，物理76.0分，英语96.0分";
        Scanner scanner = new Scanner(System.in); //使用构造方法Scanner(String str)创建scanner
        String regex = "[^0123456789.]+";
        scanner.useDelimiter(regex); /*scanner调用useDelimiter(String regex)*/
        double sum=0; int i=0;
        while(scanner.hasNext()){
            try{
                double score = scanner.nextDouble(); //scanner调用nextDouble()返回数字单词
                sum = sum+score; i++;
                System.out.println(score);
            }
            catch(InputMismatchException exp){
                String t = scanner.next();
            }
        }
        System.out.printf("%.2f\n",sum);//输出总分
        System.out.printf("%.2f",sum/i);//输出平均分
    }
}
