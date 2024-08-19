
package entities;
import java.util.ArrayList;
public class SaleReport {

    public static void generateMonthlyReport(ArrayList<Transaction> transactions, int month, int year) {
        double totalRevenue = 0;
        int transactionCount = 0;

        for (Transaction transaction : transactions) {
            if (transaction.getDate().getMonthValue() == month && transaction.getDate().getYear() == year) {
                totalRevenue += transaction.getTotalAmount();
                transactionCount++;
            }
        }

        System.out.println("Monthly Sales Report for " + month + "/" + year);
        System.out.println("Total Revenue: RS." + totalRevenue);
        System.out.println("Number of Transactions: " + transactionCount);
    }
}

