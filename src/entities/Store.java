package entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Store {
    //static fields
    private static ArrayList<Product> products;//stock products
    private static ArrayList<Employee> employees;
    
    static{
        products = new ArrayList();
        employees = new ArrayList();
    
    }
    
    
    
    
    public static String forgetPassword(String u_name){
        for (int i = 0; i < employees.size(); i++) {
            if (u_name.equals(employees.get(i).getU_name())){
                return employees.get(i).getPassword();
            }
        }
        return null;    
    }
    
    public static boolean verify_emp(String u_name,String pass){
        for (int i = 0; i < employees.size(); i++) {
            if (u_name.equals(employees.get(i).getU_name())&&
                    pass.equals(employees.get(i).getPassword())) {
                return true;
            }
        }
        return false;
    }
    
    
    public static void addEmployee(Employee e){
        if (e!=null) {
            employees.add(e);
        }
        else
            showErrorMessage("Employee data not received");    
    }
    
    
    
    
    
    
    
    
    
    public static void deleteProduct(Product obj){
        for (int i = 0; i < products.size(); i++) {
            if (obj.getPid()==products.get(i).getPid()) {
                products.remove(i);
            }
        }
        System.out.println(products.size());
    }
    
    public static void updateProduct(int id, Product obj){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPid()==id) {
                products.get(i).setName(obj.getName());
                products.get(i).setCategory(obj.getCategory());
                products.get(i).setW_sale_price(obj.getW_sale_price());
                products.get(i).setR_price(obj.getR_price());
                products.get(i).setStock(obj.getStock());
                showErrorMessage("product update successfully");
            }
        }
    }
    
    
    
    public static void dummyProducts(){
        products.add(new Product(1,"Kitkat","snacks",10,100,150));
        products.add(new Product(2,"bounty","snacks",100,300,450));
        products.add(new Product(3,"Lays","snacks",50,60,100));
        products.add(new Product(4,"Bread","food",60,200,350));
        products.add(new Product(5,"Apple","fruit",70,100,200));        
    }
    
    
//    public Store(){
//        products = new ArrayList();
//    }
    
    public static void showErrorMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);    
    }
    
    
    //search product by name
    public static Product searchProductByName(String name){
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                return products.get(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Product not found");    
        return null;
    } 
    
    //add product
    public static void addProduct(Product obj){
        if(obj!=null){
            products.add(obj);    
//            JOptionPane.showMessageDialog(null, "product added successfully");
        }
        else{
            JOptionPane.showMessageDialog(null, "product data not recieved");
        }
    }
    
    //get all Product
    //select * from products;
    public static ArrayList<Product> getAllProducts(){
        return products;    
    }
    
}
