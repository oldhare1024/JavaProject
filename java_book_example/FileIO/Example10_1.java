package java_book_example.FileIO;

import java.io.File;
import java.io.IOException;

public class Example10_1 {
    public static void main(String[] args) {
        File f = new File("D:\\java", "Example10_1.java");
        System.out.println(f.getName() + "�ǿɶ�����\n" + f.canRead());
        System.out.println(f.getName() + "�ĳ���: " + f.length());
        System.out.println(f.getName() + "����·��:" + f.getAbsolutePath());
        File file = new File("new.txt");
        System.out.println("�ڵ�ǰĿ¼�´������ļ�" + file.getName());
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("�����ɹ�");
            } catch (IOException ignored) {
            }
        }
    }
}
