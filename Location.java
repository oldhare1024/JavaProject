import java.util.Scanner;
public class Location {
    public int row,column;
    public double maxValue;
    Location(){
    }
    Location(double maxValue,int row,int column){
        this.maxValue = maxValue;
        this.row = row;
        this.column = column;
    }
    public static Location locateLargetst(double[][] a) {
        double max = a[0][0];
        int row = 0,column = 0;
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<a[i].length;j++) {
                if(max<a[i][j]) {
                    max = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        Location location = new Location(max,row,column);
        return location;
    }
}
class B{
    public static void main(String[] args) {
        System.out.println("�����ά�����������������");
        Scanner reader = new Scanner(System.in);
        int row = reader.nextInt(),column = reader.nextInt();
        System.out.println("�������飺");
        double[][] array = new double[row][column];
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                array[i][j] = reader.nextDouble();
            }
            System.out.println();
        }
        Location location = new Location();
        location.locateLargetst(array);
        System.out.println("���Ԫ�ؼ����±��ǣ�"+location.locateLargetst(array).maxValue+" �ڣ�"+(location.locateLargetst(array).row+1)+"��"+(location.locateLargetst(array).column+1)+"��");
    }
}
