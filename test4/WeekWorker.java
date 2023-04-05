package test4;

public class WeekWorker extends Employee {
    private double week, salary;

    WeekWorker(double w, double s) {
        week = w;
        salary = s;
    }

    public double earnings() {
        return week * salary;
    }
}
