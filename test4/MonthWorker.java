package test4;

public class MonthWorker extends Employee {
    private double month, salary;

    MonthWorker(double m, double s) {
        month = m;
        salary = s;
    }

    public double earnings() {
        return month * salary;
    }
}
