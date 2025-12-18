import java.sql.*;

public class DBOperations {

    // Crate table if not exist.
    public static void createTable() {
        String qry = "CREATE TABLE IF NOT EXISTS expenses (" +
                "id SERIAL PRIMARY KEY, " +
                "amount NUMERIC(5, 2) NOT NULL, " +
                "date DATE NOT NULL); ";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(qry);
            System.out.println("Table created if not exist.");
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertExpense(float amount, Date date) {
        String qry = "INSERT INTO expenses (amount, date) VALUES (" + amount + ", '" + date + "')";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(qry);
            System.out.println("User inserted successfully.");
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchAllExpense() {
        String qry = "SELECT * FROM expenses";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            System.out.println("-------------------------------------------------------");
            System.out.println("|       ID    |       Amount  |            Date        |");
            System.out.println("-------------------------------------------------------");

            while(rs.next()){
                System.out.println("|       " + rs.getInt("id") + "     |       " +
                        rs.getFloat("amount") + "   |        " +
                        rs.getDate("date") + "      |");
            }

            System.out.println("-------------------------------------------------------");

            rs.close();
            stmt.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchExpenseByDate(Date date) {
        String qry = "SELECT * FROM expenses WHERE date = '" + date + "';";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            System.out.println("-------------------------------------------------------");
            System.out.println("|       ID    |       Amount  |            Date        |");
            System.out.println("-------------------------------------------------------");

            while(rs.next()){
                System.out.println("|       " + rs.getInt("id") + "     |       " +
                        rs.getFloat("amount") + "   |        " +
                        rs.getDate("date") + "      |");
            }

            System.out.println("-------------------------------------------------------");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchTopRecentlyAddedExpenseByCount(int count) {
        String qry = "SELECT * FROM expenses ORDER BY id DESC LIMIT " + count + ";";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            System.out.println("-------------------------------------------------------");
            System.out.println("|       ID    |       Amount  |            Date        |");
            System.out.println("-------------------------------------------------------");

            while(rs.next()) {
                System.out.println("|       " + rs.getInt("id") + "     |       " +
                        rs.getFloat("amount") + "   |        " +
                        rs.getDate("date") + "      |");
            }

            System.out.println("-------------------------------------------------------");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchLowestExpense() {
        String qry = "SELECT MIN(amount) AS Expense FROM expenses";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            System.out.println("---------------------");
            System.out.println("|       Amount      |");
            System.out.println("---------------------");

            if (rs.next()) {
                System.out.println("|       " + rs.getFloat(1) + "      |");
            }
            System.out.println("---------------------");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void fetchHighestExpense() {
        String qry = "SELECT MAX(amount) AS Expense FROM expenses";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            System.out.println("---------------------");
            System.out.println("|       Amount      |");
            System.out.println("---------------------");

            if(rs.next()) {
                System.out.println("|       " + rs.getFloat(1) + "      |");
            }
            System.out.println("---------------------");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void sortExpenseByDate() {
        String qry = "SELECT * FROM expenses ORDER BY date ";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            System.out.println("-------------------------------------------------------");
            System.out.println("|       ID    |       Amount  |            Date        |");
            System.out.println("-------------------------------------------------------");

            while(rs.next()) {
                System.out.println("|       " + rs.getInt("id") + "     |       " +
                        rs.getFloat("amount") + "   |        " +
                        rs.getDate("date") + "      |");
            }

            System.out.println("-------------------------------------------------------");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void sortExpenseByAmount() {
        String qry ="SELECT * FROM expenses ORDER BY amount";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);

            System.out.println("-------------------------------------------------------");
            System.out.println("|       ID    |       Amount  |            Date        |");
            System.out.println("-------------------------------------------------------");

            while(rs.next()) {
                System.out.println("|       " + rs.getInt("id") + "     |       " +
                        rs.getFloat("amount") + "   |        " +
                        rs.getDate("date") + "      |");
            }

            System.out.println("-------------------------------------------------------");

            rs.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void countExpenses() {
        String qry = "SELECT COUNT(id) FROM expenses";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet res = stmt.executeQuery(qry);

            if(res.next()){
                System.out.println("Total expenses are : " + res.getInt(1));
            }

            res.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteExpenseByDate(Date date) {
        String qry = "DELETE FROM expenses WHERE date = '" + date + "';1";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(qry);
            System.out.println("Expense deleted successfully.");
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteAllExpenses() {
        String qry = "DELETE FROM expenses";

        try {
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(qry);
            System.out.println("All expenses deleted successfully.");
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
