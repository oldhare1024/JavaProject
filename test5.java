public class test5 {
    public static void main(String[] args) {
        int i, j = 0;
        for (i = 0; i < 5; i++) {
            if (i == 4)
                break;
            System.out.print(i);
        }
        System.out.println("," + i);
        while (j < 5 && j != 4) {
            System.out.print(j);
            j++;
        }
        System.out.println("," + j);
    }
}
