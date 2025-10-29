
/**
 * Write a description of class ExpenseManager here.
 *
 * @author (Alyssa Novelli)
 * @version (October 29, 2025)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ExpenseManager
{
    private ArrayList<Expense> expenses;
    public ExpenseManager() {
        expenses = new ArrayList<>();
    }
    public void addExpenses (Scanner input) {
        System.out.print("Enter expense amount: ");
        double amount = input.nextDouble();
        input.nextLine();
        
        System.out.println("Enter expense category: ");
        String category = input.nextLine();
        
        System.out.print("Enter description: ");
        String description = input.nextLine();
        
        Expense newExpense = new Expense(amount, category, description);
        
        expenses.add(newExpense);
        System.out.println("Expense added successfully.");
    }
    public void viewExpenses () {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded yet.");
            return;
        }
        System.out.println("\n=== Expense List ===");
        
        for (int i = 0; i < expenses.size(); i++) {
            Expense e = expenses.get(i);
            System.out.println((i + 1) + ". " + e);
        }
    }
    
}
