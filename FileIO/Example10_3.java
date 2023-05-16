package FileIO;

import java.io.File;

public class Example10_3 {
    public static void main(String[] args) {
        try {
            Runtime rt = Runtime.getRuntime();
            File f = new File("C:/windows", "Notepad.exe");
            rt.exec(f.getAbsolutePath());
            f = new File("C:\\Program Files\\Internet Explorer", "IEXPLORE https://bing.com");
            rt.exec(f.getAbsolutePath());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
