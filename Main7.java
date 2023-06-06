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
        int w = input.nextInt(); //�ɼ�������һ��ֵ
        int h = input.nextInt(); //�ɼ�������һ��ֵ
        Rectangle rect = new Rectangle();
        rect.setWidth(w);  //����wΪ���ζ���rect�Ŀ�
        rect.setHeight(h); //����hΪ���ζ���rect�ĸ�
        System.out.print("Perimeter:" + rect.getPerimeter());
        System.out.println(",Area:" + rect.getArea());
        input.close();
    }
}
