
package entities;


import java.time.LocalDateTime;
import java.util.List;

public class Transaction {
    private int transactionId;
    private LocalDateTime date;
    private List<Product> products;
    private double totalAmount;

    public Transaction(int transactionId, List<Product> products) {
        this.transactionId = transactionId;
        this.date = LocalDateTime.now();
        this.products = products;
        this.totalAmount = calculateTotalAmount();
    }

    private double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getR_price()* product.getStock();
        }
        return total;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // toString method to display transaction details
    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + 
               "\nDate: " + date + 
               "\nProducts: " + products + 
               "\nTotal Amount: $" + totalAmount;
    }
}

