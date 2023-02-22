public class Main {
    public static void main(String[] args) {
        int x = 12, y = 10;
        if ((x == 12) && ((y = (x + y)) > 20)) x++;//x=13,y=22
        if ((y != 22) || ((x = (x + y)) > 25)) y--;//x=35,y=21
        System.out.println(x + "," + y);
    }
}
