import java.util.Scanner;

abstract class shape {
    public abstract int getPerimeter();

    public abstract int getArea();
}

class Rectangle extends shape {
    private int width;
    private int height;

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return (width * height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt(); //由键盘输入一个值
        int h = input.nextInt(); //由键盘输入一个值
        Rectangle rect = new Rectangle();
        rect.setWidth(w);  //设置w为矩形对象rect的宽
        rect.setHeight(h); //设置h为矩形对象rect的高
        System.out.print("Perimeter:" + rect.getPerimeter());
        System.out.println(",Area:" + rect.getArea());
        input.close();
    }
}
