public class Sum2 {
    public static void main(String args[]) {
        long a, b = 0, c = 0;
        System.out.println("����8+88+888...ǰ10��֮��");
        for (a = 1; a <= 10; a++) {         //ѭ��10��
            b = b * 10 + 8;           //ÿһ������ǰһ������10����8
            c += b;               //����10��֮��
        }
        System.out.print(c);
    }
}