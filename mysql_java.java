import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysql_java {
    public static void main(String[] args) {
        try {
            // Load the MySQL Connector/J driver
            Class.forName("com.mysql.jdbc.Driver");

            // Create a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "password");

            // Create a statement object to execute SQL queries
            Statement stmt = conn.createStatement();

            // Execute a query and get the result set
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Iterate over the result set and print the data
            while (rs.next()) {
                System.out.println(rs.getString("username") + ", " + rs.getString("password"));
            }

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
