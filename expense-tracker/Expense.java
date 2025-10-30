
/**
 * Write a description of class Expense here.
 *
 * @author (Alyssa Novelli)
 * @version (October 30, 2025)
 */
public class Expense
{
    private double amount;
    private String category;
    private String description;
    
    public Expense(double amount, String category, String description) {
        this.amount = amount;
        this.category = category;
        this.description = description;
    }
    public double getAmount() {
        return amount;
    }
    public String getCategory() {
        return category;
    }
    public String getDescription() {
        return description;
    }
    
    public String toString() {
        return category + " - $" + String.format("%.2f", amount) + " - " + description;
    } 
}
