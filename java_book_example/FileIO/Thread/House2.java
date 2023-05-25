package java_book_example.FileIO.Thread;

public class House2 implements Runnable {
    int WaterAmount;
    Thread dog;
    Thread cat;

    House2() {
        this.dog = new Thread(this);
        this.cat = new Thread(this);
    }

    public void setWater(int WaterAmount) {
        this.WaterAmount = WaterAmount;
    }

    public void run() {
        while (true) {
            //String name=java_book_example.FileIO.Thread.currentThread().getName();
            Thread t = Thread.currentThread();
            if (t == dog) {
                System.out.println("����ˮ");
                WaterAmount -= 2;
            } else if (t == cat) {
                System.out.println(t.getName() + "è��ˮ");
                WaterAmount -= 1;
            }
            System.out.println("ʣ" + WaterAmount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (WaterAmount <= 0) {
                System.out.println("ˮ��������");
                return;
            }
        }
    }
}
