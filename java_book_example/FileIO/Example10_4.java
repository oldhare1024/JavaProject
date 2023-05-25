package java_book_example.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example10_4 {
    public static void main(String[] args) {
        int n;
        byte[] a = new byte[100];
        try {
            File f = new File("FileIO/Example10_4.java");
            InputStream in = new FileInputStream(f);
            while ((n = in.read(a, 0, 100)) != -1) {
                String s = new String(a, 0, n);
                System.out.println(s);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error: " + e);
        }
    }
}
