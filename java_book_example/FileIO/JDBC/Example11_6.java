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
        content = findRecord.getRecord();//���ض�ά���飬����ѯ��ȫ����¼
        tableHead = findRecord.getColumnName();//����ȫ���ֶ���
        if (content == null || tableHead == null)
            System.out.println("ֵΪ��");
        else {
            table = new JTable(content, tableHead);//���Ƹ�����������
            win.add(new JScrollPane(table));
            win.setBounds(12, 100, 400, 200);
            win.setVisible(true);
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
