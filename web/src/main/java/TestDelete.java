import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class TestDelete {
    public static void main(String[] args) throws SQLException {
        QueryRunner qr = new QueryRunner(jdbc_web.getDataSource());
        String sql = "delete from user1 where id=?";
        int count = qr.update(sql, 2);
        System.out.println(count);
    }
}
