package test3;

import java.util.Scanner;

public class Location {
    public int row, column;
    public double maxValue;


    public static Location locateLargetst(double[][] a) {
        Location L = new Location();
        L.maxValue = a[0][0];
        int i, j;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (a[i][j] > L.maxValue) {
                    L.maxValue = a[i][j];
                    L.row = i;
                    L.column = j;
                }
            }
        }
        return L;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("�����ά���������������:");
        int r = S.nextInt(), c = S.nextInt();
        System.out.println("��������:");
        double[][] a = new double[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = S.nextDouble();
            }
        }
        Location Loc = Location.locateLargetst(a);
        System.out.println("���Ԫ�ؼ����±���: " + Loc.maxValue + "��(" + Loc.row + "," + Loc.column + ")");
    }
}

