class Student {
    int number;
}

public class obj_array {
    public static void main(String[] args) {
        Student[] stu = new Student[10];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = new Student();
            stu[i].number = 101 + i;
            System.out.print(" " + stu[i].number);
        }
    }
}
