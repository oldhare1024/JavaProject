package human;

public class Student extends People {
    int number;

    void tellNumber() {
        System.out.printf("ѧ�ţ�%d\t", number);
    }

    int add(int x, int y) {
        return x + y;
    }
}
