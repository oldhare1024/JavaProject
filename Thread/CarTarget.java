package Thread;

public class CarTarget implements Runnable {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("½Î³µ" + i + " ");
        }
    }
}
