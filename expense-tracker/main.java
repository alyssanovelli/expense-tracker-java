
/**
 * Write a description of class main here.
 *
 * @author (Alyssa Novelli)
 * @version (October 29, 2025)
 */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        ExpenseManager manager = new ExpenseManager();
        while (running) {
            System.out.println("\n=== Expense Tracker Menu ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expense");
            System.out.println("3. Delete Expense");
            System.out.println("4. Exit Menu");
            System.out.print("Choose an option: ");
            
            int choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
                case 1:
                    manager.addExpenses(input);
                    break;
                case 2: 
                    manager.viewExpenses();
                    break;
                case 3:
                    manager.deleteExpenses(input);
                    break
                case 4: 
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
