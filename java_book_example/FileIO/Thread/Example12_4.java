package java_book_example.FileIO.Thread;

public class Example12_4 {
    public static void main(String[] args) {
        House2 house2 = new House2();
        house2.setWater(16);
        house2.dog.start();
        house2.cat.start();
    }
}
