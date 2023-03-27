package anonymous;

public class OutputEnglish extends OutputAlphabet {
    public void output() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.printf("%3c", c);
        }
        System.out.print("\n");
    }
}
