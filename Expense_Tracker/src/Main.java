import java.sql.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DBConnection.getConnection();
        System.out.println("Ready for further process!");

        DBOperations.createTable();

        int op = 0;

        while(op != 12) {

            System.out.println();
            System.out.println("---------MENU---------------------------");
            System.out.println("| 1. Insert new expense                |");
            System.out.println("| 2. Fetch all expenses                |");
            System.out.println("| 3. Fetch expense for particular date | ");
            System.out.println("| 4. Fetch recently added expenses     |");
            System.out.println("| 5. Fetch lowest expense              |");
            System.out.println("| 6. Fetch highest expense             |");
            System.out.println("| 7. Sort expenses by date             |");
            System.out.println("| 8. Sort expenses by amount           |");
            System.out.println("| 9. Count total expenses              |");
            System.out.println("| 10. Delete expense by date           |");
            System.out.println("| 11. Delete all expenses              |");
            System.out.println("| 12. Exit                             |");
            System.out.println("----------------------------------------");

            System.out.println("Enter your choice : ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.println("Enter amount : ");
                    float amount = sc.nextFloat();

                    System.out.println("Enter date in (yyyy-mm-dd) format : ");
                    String date = sc.next();

                    DBOperations.insertExpense(amount, Date.valueOf(date));
                }

                case 2 -> DBOperations.fetchAllExpense();

                case 3 -> {
                    System.out.println("Enter date in (yyyy-mm-dd) format : ");
                    String date = sc.next();

                    DBOperations.fetchExpenseByDate(Date.valueOf(date));
                }

                case 4 -> {
                    System.out.println("How many expenses you want : ");
                    int count = sc.nextInt();
                    DBOperations.fetchTopRecentlyAddedExpenseByCount(count);
                }

                case 5 -> DBOperations.fetchLowestExpense();

                case 6 -> DBOperations.fetchHighestExpense();

                case 7 -> DBOperations.sortExpenseByDate();

                case 8 -> DBOperations.sortExpenseByAmount();

                case 9 -> DBOperations.countExpenses();

                case 10 -> {
                    System.out.println("Enter date in (yyyy-mm-dd) format : ");
                    String date = sc.next();
                    DBOperations.deleteExpenseByDate(Date.valueOf(date));
                }

                case 11 -> DBOperations.deleteAllExpenses();

            }
        }

        DBConnection.closeConnection();
        System.out.println("Process complete");
    }
}