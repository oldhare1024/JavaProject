package FileIO;

import java.io.File;

public class Example10_2 {
    public static void main(String[] args) {
        File dirFile = new File(".");
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java");
        String filename[] = dirFile.list(fileAccept);
        for (String name : filename) {
            System.out.println(name);
        }
    }
}
