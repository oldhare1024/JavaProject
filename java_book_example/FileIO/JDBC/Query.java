package java_book_example.FileIO.JDBC;

import java.sql.*;

public class Query {
    String databaseName = "";//���ݿ���
    String SQL;//SQL���
    String[] columnName;//ȫ���ֶ���
    String[][] record;//��ѯ�ļ�¼

    public Query() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
        }
    }

    public void setDatabaseName(String s) {
        databaseName = s.trim();
        //System.out.println(databaseName);
    }

    public void setSQL(String SQL) {
        this.SQL = SQL.trim();
    }

    public String[] getColumnName() {
        if (columnName == null) {
            System.out.println("�Ȳ�ѯ��¼");
            return null;
        }
        return columnName;
    }

    public String[][] getRecord() {
        startQuery();
        return record;
    }

    public void startQuery() {
        Connection con;
        Statement sql;
        ResultSet rs;
        String uri = "jdbc:mysql://localhost:3306/" + databaseName + "?useSSL=true&characterEncoding=utf-8";
        try {
            con = DriverManager.getConnection(uri, "root", "110120");
            sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = sql.executeQuery(SQL);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();//�ֶ���Ŀ
            columnName = new String[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                columnName[i - 1] = metaData.getColumnName(i);
            }
            rs.last();//������м�¼��Ŀ
            int recordAmount = rs.getRow();
            record = new String[recordAmount][columnCount];
            int j = 0;
            rs.beforeFirst();
            while (rs.next()) {
                for (int k = 1; k <= columnCount; k++) {
                    record[j][k - 1] = rs.getString(k);//��j����¼�����ά����ĵ�j��
                }
                j++;
            }
            con.close();
        } catch (Exception e) {
            System.out.println("��������ȷ�ı���" + e);
        }
    }
}
