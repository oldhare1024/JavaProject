import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.print("������");
                break;
            case 2:
                System.out.println("������");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("��Ϣ��");
                break;
            case 7:
                System.out.println("��Ϣ��");
                break;
            default:
                System.out.println("��������");
                break;
        }
    }
}
