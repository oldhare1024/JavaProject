import java.util.Scanner;

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double getLength() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        if (radius < 0) {
            System.out.println("Radius must be positive!");
        } else {
            Circle circle1 = new Circle(radius);
            System.out.printf("%.2f,%.2f", circle1.getLength(), circle1.getArea());
        }
    }
}
