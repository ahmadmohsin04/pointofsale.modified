
package entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductReport {

    public static void generateProductReport(List<Transaction> transactions) {
        Map<Product, Integer> productSales = new HashMap<>();

        for (Transaction transaction : transactions) {
            for (Product product : transaction.getProducts()) {
                productSales.put(product, productSales.getOrDefault(product, 0) + product.getStock());
            }
        }

        System.out.println("Product-Wise Sales Report");
        for (Map.Entry<Product, Integer> entry : productSales.entrySet()) {
            System.out.println(entry.getKey().getName() + ": " + entry.getValue() + " are the units sold");
        }
    }
}




