import java.util.Scanner;

public class hanio {
    static int cnt;

    //�����������ݹ麯���Ĳ����б�
//��һ����������ŵ������
//�ڶ�����������ʼ��
//������������������
//���ĸ�������Ŀ���
    static void hanio(int id, char from, char to) {
        System.out.printf("step %d: move %d from %c->%c\n", ++cnt, id, from, to);
    }

    static void move(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.printf("%c --> %c\n", a, c);
            return;
        }
        move(n - 1, a, c, b);
        hanio(n, a, c);
        move(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = 0;
        cnt = 0;
        System.out.println("����һ��ֵ��");
        step = sc.nextInt();
        move(step, 'A', 'B', 'C');
    }
}
