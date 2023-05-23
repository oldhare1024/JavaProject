package Thread;

public class House implements Runnable {
    int WaterAmount;

    public void setWater(int WaterAmount) {
        this.WaterAmount = WaterAmount;
    }

    public void run() {
        while (true) {
            String name = Thread.currentThread().getName();
            if (name.equals("狗")) {
                System.out.println(name + "喝水");
                WaterAmount -= 2;
            } else if (name.equals("猫")) {
                System.out.println(name + "喝水");
                WaterAmount -= 1;
            }
            System.out.println("剩" + WaterAmount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (WaterAmount <= 0) {
                System.out.println("水余量不足");
                return;
            }
        }
    }
}
