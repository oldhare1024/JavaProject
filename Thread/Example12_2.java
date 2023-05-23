package Thread;

public class Example12_2 {
    public static void main(String[] args) {
        Thread speakElephant;
        Thread speakCar;
        ElephantTarget elephant;
        CarTarget car;
        elephant = new ElephantTarget();
        car = new CarTarget();
        speakElephant = new Thread(elephant);
        speakCar = new Thread(car);
        speakElephant.start();
        speakCar.start();
        for (int i = 1; i <= 15; i++) {
            System.out.println("主人的任务" + i + "罢了");
        }
    }
}
