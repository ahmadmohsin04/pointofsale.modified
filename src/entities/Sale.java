/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Bilal Arif
 */
public class Sale {
    private Customer customer;
    private static ArrayList<Product> sellProducts;
    private LocalDateTime sellDateTime;
    private int qty;

    public Sale() {
    }

    public Sale(int qty,Customer customer, LocalDateTime sellDateTime) {
        this.qty = qty;
        this.customer = customer;
        this.sellDateTime = sellDateTime;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public static ArrayList<Product> getSellProducts() {
        return sellProducts;
    }

    public static void setSellProducts(ArrayList<Product> sellProducts) {
        Sale.sellProducts = sellProducts;
    }

    public LocalDateTime getSellDateTime() {
        return sellDateTime;
    }

    public void setSellDateTime(LocalDateTime sellDateTime) {
        this.sellDateTime = sellDateTime;
    }
    
    
    
    
}
