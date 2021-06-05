/**
 * 
 * Question 10.1:
 * 
 * The following code needs some package to work properly. Write appropriate
 * code to import the required package(s) in order to make the program compile
 * and execute successfully.
 */

//Import required packages
import java.sql.*;

public class Question101 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            System.out.print(conn.isValid(1));
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
