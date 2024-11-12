/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import models.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MRaslanPC
 */


public class Test {
    public static void main(String[] args) {
        
        // Create Users
        
        
        // Create Addresses
        Address address1 = new Address("123 Elm Street", "Springfield", "12345", "USA");
        Address address2 = new Address("456 Oak Avenue", "Shelbyville", "67890", "USA");
        User user1 = new User("John", "1234", "john12", "johnDoe", address1);
        User user2 = new User("Raslan", "1234", "raslan123", "johnDoe", address2);
        
        // Create Items
        Item item1 = new Item("P143", "Pizaa 143", "Backry", 170.50, "Pizaa");
        Item item2 = new Item("P153", "Pizaa 153", "Backry", 160.50, "Pizaa");
        Item item3 = new Item("P163", "Pizaa 163", "Backry", 150.50, "Pizaa");
        
        // Create Order Items List
        List<Item> orderItems = new ArrayList<>();
        orderItems.add(item1);
        orderItems.add(item2);
        
        // Create Orders
        Order order1 = new Order(101, user1, orderItems, address1);
        Order order2 = new Order(102, user2, orderItems, address2);
        
        // Display Order Details
        System.out.println("Order 1 Details:");
        System.out.println("Order ID: " + order1.getOrderID());
        System.out.println("Total Price: " + order1.getTotalPrice());
        
        System.out.println("\nOrder 2 Details:");
        System.out.println("Order ID: " + order2.getOrderID());
        System.out.println("Total Price: " + order2.getTotalPrice());
        
        // Admin remove Item from Menu
        Admin admin = new Admin(1001, "Welson", "welson@out.look");
        
        // Create Menu
        Menu menu = new Menu();
        admin.addMenuItem(menu, item1);
        admin.addMenuItem(menu, item2);
        System.out.println(menu.getItems());
        
        admin.removeMenuItem(menu, item2);
        System.out.println(menu.getItems());
        
        
        System.out.println("===================================================================");
        
        
        
        
        // Create Discount and Apply
        //Discount discount = new Discount(10.0, "DISCOUNT10", "2024-12-01");
        //discount.applyDiscount(order1); // Apply discount to order1
        
        // Display Total after Discount
        System.out.println("\nOrder 1 after discount:");
        System.out.println("Total Price After Discount: " + order1.getTotalPrice());
        
        // Create Payment Transaction
        PaymentTransaction paymentTransaction = new PaymentTransaction(order1,"Visa", 150.65, "Credit");
        paymentTransaction.paymentProcess();
        
        // Generate Invoice
        Invoice invoice = new Invoice(order1,orderItems,2.5, 30);
        System.out.println("\nInvoice Details:");
        invoice.printInvoice();
        
        // Update Order Status
//        order1.updateOrderStatus(OrderStatus.CONFIRMED);
//        order2.updateOrderStatus(OrderStatus.CANCELLED);
        
        // Show Final Status of Orders
        System.out.println("\nFinal Order Statuses:");
        System.out.println("Order 1 Status: " + order1.getOrderStatus());
        System.out.println("Order 2 Status: " + order2.getOrderStatus());
    }
}
