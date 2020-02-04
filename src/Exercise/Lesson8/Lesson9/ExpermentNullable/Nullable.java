package Exercise.Lesson8.Lesson9.ExpermentNullable;

import sun.security.util.Password;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public class Nullable {
    private static String DB_URL = "";
    private static String USERNAME = "";
    private static String PASSWORD = "";
    private static String conn = null;
    private static String createConnection() {
        conn = "Connect";
        return conn;
    }

    public static String getConnection() {
        return Optional.ofNullable(conn).orElseGet(() -> {
            System.out.println("Trying to Connect for the first time");
            return createConnection();
        });
    }
    public static void main(String [] args) {
        String co = getConnection();
        System.out.println(co);
    }
}
