package java_book_example.FileIO.Thread;

public class SpeakElephant extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            System.out.println("大象" + i + "的任务罢了");
        }
    }
}
