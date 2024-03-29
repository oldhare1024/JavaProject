import java.util.Arrays;

public class kmp2 {
    public static void main(String[] args) {
        String a = "ABACABAD";
        String b = "BBCABACABACABADAABDE";
        int result = k2(b, a);
        //打印结果：和字符串获得匹配的位置
        System.out.println("结果位置（从0开始数）：" + result);
    }
    //kMP 匹配
    public static int k2(String str, String dest) {
        //1.首先计算出 部分匹配表
        int[] next = kmpnext(dest);
        //2.查找匹配位置
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
    //计算部分匹配表
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