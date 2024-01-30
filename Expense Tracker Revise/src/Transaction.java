import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private Date date;
    private String category;
    private String amount;
    private int transactionType;
    private double balance;
    private double totalAmount;

    public Transaction(Date date, String category, String amount, int transactionType, double balance) {
        this.date = date;
        this.category = category;
        this.amount = amount;
        this.transactionType = transactionType;
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public String getCategory() {
        return category;
    }

    public String getAmount() {
        return amount;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public double getBalance() {
        return balance;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getAmountValue() {
        return Double.parseDouble(amount);
    }

    public String toFileString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String transactionTypeString = (transactionType == 1) ? "Expense" : "Income";

        return dateFormat.format(date) + "\t" +
                transactionTypeString + "\t\t" +
                category + "\t" +
                String.format("%.2f", Double.parseDouble(amount)) + "\t" +
                String.format("%.2f", balance) + "\t" +
                String.format("%.2f", totalAmount);
    }
}
