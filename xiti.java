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
        System.out.println("�����������������:" + (n - 1));
    }
}
