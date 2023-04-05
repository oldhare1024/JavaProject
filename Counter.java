public class Counter {
    int myCount =100;
    static int ourCount =500;

    void increment() {
        myCount++;
        ourCount++;
    }
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        counter1.increment();
        counter1.increment();
        System.out.print(counter1.myCount+","+counter1.ourCount+",");
        counter2.increment();
        System.out.print(counter2.myCount+","+counter2.ourCount);
    }
}
