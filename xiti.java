public class xiti {
    public static void main(String[] args) {
        int n = 1;
        long sum = 0;
        while (true) {
            sum = sum + n;
            n++;
            if (sum >= 8888)
                break;
        }
        System.out.println("满足条件的最大整数:" + (n - 1));
    }
}
