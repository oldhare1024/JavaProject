public class switch_print {
    public static void main(String[] args) {
        int i = 10, j = 18, k = 30;
        switch (j - i) {
            case 8:
                k++;
            case 9:
                k += 2;
            case 10:
                k += 3;
            default:
                k /= j;
        }
        System.out.println(k);
    }
}
