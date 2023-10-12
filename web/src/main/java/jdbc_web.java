import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * druid测试
 */
public class jdbc_web {
    private static DataSource datasource;

    static {
        //加载配置文件
        Properties pro = new Properties();
        InputStream is = jdbc_web.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            pro.load(is);
            //获取连接池对象
            datasource = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DataSource getDataSource() {
        return datasource;
    }
}