package test3;

public class Fan {
    static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    public String color;
    private int speed;
    private boolean on;
    private double radius;

    Fan() {
        color = "blue";
        speed = SLOW;
        on = false;
        radius = 5.0;
    }

    int getSpeed() {
        return speed;
    }

    boolean getOn() {
        return on;
    }

    double getRadius() {
        return radius;
    }

    String getColor() {
        return color;
    }

    void setSpeed(int s) {
        speed = s;
    }

    void setOn(boolean o) {
        on = o;
    }

    void setRadius(double r) {
        radius = r;
    }

    void setColor(String c) {
        color = c;
    }

    void toString1() {
        if (on) {
            System.out.println("风扇的速度为：" + speed + "，风扇的颜色为：" + color + "，风扇的半径为：" + radius);
        } else {
            System.out.println("fan is off" + "，风扇的颜色为：" + color + "，风扇的半径为：" + radius);
        }
    }

    public static void main(String[] args) {
        Fan A = new Fan();
        Fan B = new Fan();
        String color1 = "yellow";
        boolean on1 = true;
        double radius1 = 10.0;

        String color2 = "blue";
        boolean on2 = false;
        double radius2 = 5.0;

        A.setSpeed(FAST);
        A.setOn(on1);
        A.setRadius(radius1);
        A.setColor(color1);

        B.setSpeed(MEDIUM);
        B.setOn(on2);
        B.setRadius(radius2);
        B.setColor(color2);

        A.toString1();
        B.toString1();
    }
}