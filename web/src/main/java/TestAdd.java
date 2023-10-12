import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class TestAdd {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(jdbc_web.getDataSource());
        String sql = "insert into user1(name,gender,age)" +
                " values(?,?,?)";
        int count = qr.update(sql, "爱美丽", "女", 20);
        System.out.println(count);
    }
}
