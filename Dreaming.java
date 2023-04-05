public class Dreaming {
    public static void main(String[] args) {
        double[] salary = {6000};
        int[] nCarsHouses = {0,0};
        DayDreaming(salary, nCarsHouses);
        System.out.print(salary[0] + "," + nCarsHouses[0]);
        System.out.println("," + nCarsHouses[1]);
    }

    static void DayDreaming(double[] salary, int[] nCarsHouses) {
        salary[0] = salary[0] * 3;
        nCarsHouses[0] += 2;
        nCarsHouses[1]++;
    }
}