public class and_or {
    public static void main(String[] args) {
        int x = 12, y = 10;
        if ((x == 12) && ((y = (x + y)) > 20))
            x++;
        if ((y != 22) || ((x = (x + y)) > 25))
            y--;
        System.out.println(x + "," + y);
    }
}
