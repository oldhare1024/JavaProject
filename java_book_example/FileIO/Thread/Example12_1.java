package java_book_example.FileIO.Thread;

import java.util.Random;

public class Example12_1 {
    public static void main(String[] args) {
        int i, maxi;
        Random rand = new Random();
        maxi = rand.nextInt(20);
        System.out.println(maxi);
        SpeakElephant speakElephant;
        SpeakCar speakCar;
        speakElephant = new SpeakElephant();
        speakCar = new SpeakCar();
        speakElephant.start();
        speakCar.start();
        for (i = 0; i < maxi; i++) {
            System.out.println("主人的任务" + i + "罢了");
        }
    }
}
