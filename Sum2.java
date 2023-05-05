public class Sum2 {
    public static void main(String args[]) {
        long a, b = 0, c = 0;
        System.out.println("计算8+88+888...前10项之和");
        for (a = 1; a <= 10; a++) {         //循环10次
            b = b * 10 + 8;           //每一个数是前一个数的10倍加8
            c += b;               //计算10项之和
        }
        System.out.print(c);
    }
}