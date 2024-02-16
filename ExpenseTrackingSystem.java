import java.util.*;
import java.io.*;
class Expense implements Serializable {
    private Date date;
    private String category;
    private double amount;
    public Expense(Date date, String category, double amount) {
        this.date = date;
        this.category = category;
        this.amount = amount;
    }
    public Date getDate() {
        return date;
    }
    public String getCategory() {
        return category;
    }
    public double getAmount() {
        return amount;
    }
}
class ExpenseTracker {
    private List<Expense> expenses;
    public ExpenseTracker() {
        expenses = new ArrayList<>();
    }
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }
    public void displayExpenses() {
        for (Expense expense : expenses) {
            System.out.println("Date: " + expense.getDate() + ", Category: " + expense.getCategory() + ", Amount: " + expense.getAmount());
        }
    }
    public double calculateTotalExpenses(String category) {
        double total = 0;
        for (Expense expense : expenses) {
            if (expense.getCategory().equals(category)) {
                total += expense.getAmount();
            }
        }
        return total;
    }
    public void saveExpensesToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(expenses);
            System.out.println("Expenses saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    public void loadExpensesFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            expenses = (List<Expense>) ois.readObject();
            System.out.println("Expenses loaded successfully!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
public class ExpenseTrackingSystem {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.addExpense(new Expense(new Date(), "Food", 50.0));
        tracker.addExpense(new Expense(new Date(), "Transportation", 30.0));
        tracker.addExpense(new Expense(new Date(), "Food", 20.0));
        tracker.displayExpenses();
        System.out.println("Total expenses for Food: $" + tracker.calculateTotalExpenses("Food"));
        tracker.saveExpensesToFile("expenses.ser");
        tracker.loadExpensesFromFile("expenses.ser");
        tracker.displayExpenses();
    }
}
