import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * druid����
 */
public class jdbc_web {
    private static DataSource datasource;

    static {
        //���������ļ�
        Properties pro = new Properties();
        InputStream is = jdbc_web.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            pro.load(is);
            //��ȡ���ӳض���
            datasource = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return datasource;
    }
}