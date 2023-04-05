package test3;


public class Rectangle {
    private double width, height;

    Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    Rectangle(double a, double b) {
        width = a;
        height = b;
    }

    double getArea() {
        double s = width * height;
        return s;
    }

    double getPermeter() {
        double l = (width + height) * 2;
        return l;
    }

    public static void main(String[] args) {
        double w1 = 4.0, h1 = 40.0, w2 = 3.5, h2 = 35.9;
        Rectangle A = new Rectangle(w1, h1);
        Rectangle B = new Rectangle(w2, h2);
        double S1, S2, L1, L2;
        S1 = A.getArea();
        L1 = A.getPermeter();
        S2 = B.getArea();
        L2 = B.getPermeter();
        String str = String.format("%.2f", S2);
        double S3 = Double.parseDouble(str);
        System.out.println("矩形A的宽，高，面积，周长为：" + w1 + "," + h1 + "," + S1 + "," + L1);
        System.out.println("矩形B的宽，高，面积，周长为：" + w2 + "," + h2 + "," + S3 + "," + L2);
    }
}