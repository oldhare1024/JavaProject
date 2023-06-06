import java.util.Arrays;

public class kmp2 {
    public static void main(String[] args) {
        String a = "ABACABAD";
        String b = "BBCABACABACABADAABDE";
        int result = k2(b, a);
        //��ӡ��������ַ������ƥ���λ��
        System.out.println("���λ�ã���0��ʼ������" + result);
    }
    //kMP ƥ��
    public static int k2(String str, String dest) {
        //1.���ȼ���� ����ƥ���
        int[] next = kmpnext(dest);
        //2.����ƥ��λ��
        for (int i = 0, j = 0; i < str.length(); i++) {
            while (j > 0 && str.charAt(i) != dest.charAt(j))
                j = next[j - 1];
            if (str.charAt(i) == dest.charAt(j))
                j++;
            if (j == dest.length())
                return i - j + 1;
        }
        return -1;
    }
    //���㲿��ƥ���
    public static int[] kmpnext(String dest) {
        int[] next = new int[dest.length()];
        next[0] = 0;
        for (int i = 1, j = 0; i < dest.length(); i++) {
            while (j > 0 && dest.charAt(j) != dest.charAt(i))
                j = next[j - 1];
            if (dest.charAt(i) == dest.charAt(j))
                j++;
            next[i] = j;
        }
        System.out.println("next =" + Arrays.toString(next));
        return next;
    }
}