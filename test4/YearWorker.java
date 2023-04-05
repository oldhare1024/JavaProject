package test4;

public class YearWorker extends Employee{
    private double year, salary;

    YearWorker(double y, double s) {
        year = y;
        salary = s;
    }

    public double earnings() {
        return year * salary;
    }
}
