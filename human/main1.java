package human;

public class main1 {
    public static void main(String[] args) {
        Student xia = new Student();
        xia.age = 16;
        xia.number = 20030520;
        xia.showPeopleMess();
        xia.tellNumber();
        int x = 9, y = 29;
        System.out.print("xia会做加法：");
        int result = xia.add(x, y);
        System.out.printf("%d+%d=%d\n", x, y, result);
        UniverStudent li = new UniverStudent();
        li.age = 18;
        li.number = 20010518;
        li.showPeopleMess();
        li.tellNumber();
        System.out.print("li会做乘法：");
        result = li.multi(x, y);
        System.out.printf("%d*%d=%d\n", x, y, result);
        boolean a = li instanceof Student;
        boolean b = xia instanceof UniverStudent;
        System.out.printf("%b %b", a, b);
    }
}
