import java.util.Scanner;

abstract class Shape {
    abstract double area();

    abstract String getShapeName();
}

class Circle1 extends Shape {
    double r;

    Circle1(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }

    String getShapeName() {
        return "Circle";
    }
}

class Rectangle extends Shape {
    double h, w;

    Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    double area() {
        return h * w;
    }

    String getShapeName() {
        return "Rectangle";
    }
}

class Calculator {
    public void play(Shape shape) {
        System.out.printf("%s:%.2f", shape.getShapeName(), shape.area());
    }
}

class Main6 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                double r = sc.nextDouble();
                calculator.play(new Circle1(r));
                break;
            case 2:
                double h = sc.nextDouble();
                double w = sc.nextDouble();
                calculator.play(new Rectangle(h, w));
                break;
            default:
                System.out.println("No corresponding shape!");
        }
    }
}
