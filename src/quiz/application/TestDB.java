import java.sql.*;

public class TestDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/quiz_db",
                "root",
                "MyySqll"
            );
            System.out.println("DB CONNECTED SUCCESSFULLY");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
