package Thread;

public class House implements Runnable {
    int WaterAmount;

    public void setWater(int WaterAmount) {
        this.WaterAmount = WaterAmount;
    }

    public void run() {
        while (true) {
            String name = Thread.currentThread().getName();
            if (name.equals("��")) {
                System.out.println(name + "��ˮ");
                WaterAmount -= 2;
            } else if (name.equals("è")) {
                System.out.println(name + "��ˮ");
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
