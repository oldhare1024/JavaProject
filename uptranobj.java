class Car {
    public void run() {
        System.out.println("���Ǹ���run()����");
    }

    public void speed() {
        System.out.println("speed:0");
    }

    public void price() {
        System.out.println("�۸�Ϊ����");
    }
}

class BMW extends Car {
    public void run() {
        System.out.println("����BMW��run()����");
    }

    public void speed() {
        System.out.println("speed:80");
    }
}

public class uptranobj extends Car {
    public static void main(String[] args) {
        show(new uptranobj());//����ת��ʵ��
        show(new BMW());
    }

    public static void show(Car car) {//����ʵ����Ϊ����
        car.run();
        car.speed();
        car.price();
    }

    public void run() {
        System.out.println("����Benz��run()����");

    }

    public void speed() {
        System.out.println("speed:100");
    }

    public void price() {
        System.out.println("Benz:800000$");
    }
}