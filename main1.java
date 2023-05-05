public class main1 {
    public static void main(String[] args) {
        int a[] = {0, 0, 0, 0, 0, 0};
        calculate(a);
        for (int x : a)
            System.out.print(x);
    }

    static void calculate(int x[]) {
        for (int i = 1; i < x.length; i++)
            x[i] = x[i - 1] + 1;
    }
}