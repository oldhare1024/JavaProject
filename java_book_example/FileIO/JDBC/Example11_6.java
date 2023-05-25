package java_book_example.FileIO.JDBC;

import javax.swing.*;

public class Example11_6 {
    public static void main(String[] args) {
        String[] tableHead;
        String[][] content;
        JTable table;
        JFrame win = new JFrame();
        Query findRecord = new Query();
        findRecord.setDatabaseName("students");
        findRecord.setSQL("select * from mess");
        content = findRecord.getRecord();//返回二维数组，即查询的全部记录
        tableHead = findRecord.getColumnName();//返回全部字段名
        if (content == null || tableHead == null)
            System.out.println("值为空");
        else {
            table = new JTable(content, tableHead);//疑似该语句出现问题
            win.add(new JScrollPane(table));
            win.setBounds(12, 100, 400, 200);
            win.setVisible(true);
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
