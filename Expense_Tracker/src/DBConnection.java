import java.sql.*;

public class DBConnection {

    private static final String url = "jdbc:postgresql://localhost:5432/expense_tracker";
    private static final String user = "postgres";
    private static final String password = "password";

    private static Connection conn = null;

    public static Connection getConnection(){
        if(conn == null) {
            try{
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connection established successfully.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void closeConnection() {
        try{
            if(conn != null) {
                conn.close();
                System.out.println("Connection closed successfully.");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

