import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12794299";
        String user = "sql12794299";
        String password = "LKyRkcxRUY";

        try {
            // 1️⃣ Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected!");

            // 2️⃣ SQL query to insert data
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

            // 3️⃣ Prepare the statement
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "John Doe"); // name
            stmt.setString(2, "john@example.com"); // email

            // 4️⃣ Execute the update
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

            // 5️⃣ Close connection
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}