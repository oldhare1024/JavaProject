public class array {
    public static void main(String[] args) {
        char []a = {'a', 'b', 'c', 'D', 'E', 'F'};
        for (char i:a) {
            if (Character.isLowerCase(i)) i = Character.toUpperCase(i);
            else if (Character.isUpperCase(i)) i = Character.toLowerCase(i);
        }
        for (char i:a) {
            System.out.print(" " + i);
        }
    }
}
