public class getdigits {
    public static void main(String[] args) {
        int n = 6, num = 9876457;
        int d1 = (int) (num / Math.pow(10, n - 1) % 10);
        int d2 = (int) (num % Math.pow(10, n) / Math.pow(10, n - 1));
        System.out.println(d1 + "," + d2);
    }
}
