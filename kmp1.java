import java.util.Scanner;

public class kmp1 {
    public String mainString;
    public String keyString;
    public char[] mainchar;
    public char[] keychar;
    public boolean flag;

    kmp1(String a, String b) {
        this.mainString = a;
        this.keyString = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        System.out.println("������������");
        a = sc.next();
        System.out.println("�������Ӵ���");
        b = sc.next();
        kmp1 k1 = new kmp1(a, b);
        if (k1.match())
            System.out.println("�Ӵ�ƥ��ɹ�");
        else
            System.out.println("�Ӵ�ƥ��ʧ��");
    }

    public boolean match() {
        int i, j;
        mainchar = mainString.toCharArray();
        keychar = keyString.toCharArray();
        int len1 = mainString.length();
        int len2 = keyString.length();
        for (i = 0; i < len1; i++) {
            for (j = 0; j < len2; j++) {
                if (mainchar[i + j] != keychar[j]) {
                    break;
                }
            }
            if (j == len2) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }
}

