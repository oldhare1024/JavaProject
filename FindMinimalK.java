public class FindMinimalK {
    public static void main(String[] args) {
        int k = 0, sum = 0;
        while (sum <= 2000) {
            k += 1;
            sum = k * (k + 1) / 2;
        }
        System.out.println("the minimal k=" + k);
    }
}