package java_book_example.FileIO.Thread;

public class CarTarget implements Runnable {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("�γ�" + i + " ");
        }
    }
}
