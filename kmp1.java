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
        System.out.println("请输入主串：");
        a = sc.next();
        System.out.println("请输入子串：");
        b = sc.next();
        kmp1 k1 = new kmp1(a, b);
        if (k1.match())
            System.out.println("子串匹配成功");
        else
            System.out.println("子串匹配失败");
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

