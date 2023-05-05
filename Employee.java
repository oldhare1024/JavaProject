import java.util.Scanner;

class Employee {
    String name;
    double salary;
    MyDate start;

    public Employee(String name, double salary, MyDate start) {
        this.name = name;
        this.salary = salary;
        this.start = start;
    }

    public void show() {
        System.out.println(name + "," + salary + "," + start.DateString());
    }
}

class MyDate {
    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String DateString() {
        return year + "-" + month + "-" + day;
    }
}

class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        scanner.nextLine();
        String[] date = scanner.nextLine().split(" ");
        MyDate start = new MyDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        Employee employee = new Employee(name, salary, start);
        employee.show();
    }
}
