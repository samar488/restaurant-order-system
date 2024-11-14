/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import models.*;
import java.util.ArrayList;
import java.util.List; 
import java.time.LocalDate;
/**
 *
 * @author Mahmoud Raslan
 */


public class Test {
    public static void main(String[] args) {
        
        // --- 1. Test Discount Class ---
        Discount discount = new Discount(10.0, "DISCOUNT10", LocalDate.of(2024, 12, 31));
        System.out.println("Discount Test:");
        System.out.println("Discount Code: " + discount.getDiscountCode());
        System.out.println("Discount Percentage: " + discount.getDiscountPercentage());
        System.out.println("Valid Until: " + discount.getValidUntil());
        System.out.println("Is discount valid? " + discount.isValid());
        System.out.println(); // Empty line for separation
        
        
        // Create Addresses
        Address address1 = new Address("123 Elm Street", "Springfield", "12345", "USA");
        User user1 = new User("John", "1234", "john12", "johnDoe", address1);       
        
        // --- 2. Test Item Class ---
        Item item1 = new Item("P143", "Pizaa 143", "Backry", 170.50, "Pizaa");
        Item item2 = new Item("P153", "Pizaa 153", "Backry", 160.50, "Pizaa");
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        System.out.println("Item Test:");
        System.out.println("Item 1: " + item1.getName() + " | Price: " + item1.getPrice());
        System.out.println("Item 2: " + item2.getName() + " | Price: " + item2.getPrice());
        System.out.println(); // Empty line for separation
                
        
        // --- 3. Test Order Class ---
        Order order = new Order(1001, user1, items, address1);
        System.out.println("Order Test:");
        System.out.println("Order ID: " + order.getOrderID());
        System.out.println("Customer Name: " + order.getUser());
        System.out.println("Shipping Address: " + order.getDeliveryAddress());
        System.out.println(); // Empty line for separation
        
        
        // --- 4. Test PaymentTransaction Class ---
        PaymentTransaction payment = new PaymentTransaction(order, "CreditCard", 100.0, "Online Payment");
        System.out.println("PaymentTransaction Test:");
        System.out.println("Transaction ID: " + payment.getPaymentTransactionID());
        System.out.println("Transaction Status: " + payment.getTransactionStatus());
        System.out.println("Total Cost before discount: " + payment.getTotalCost());
        payment.discountApplied(10); // Apply 10% discount
        System.out.println("Total Cost after discount: " + payment.getTotalCost());
        payment.paymentProcess(); // Process payment
        System.out.println("Transaction Status after payment: " + payment.getTransactionStatus());
        payment.transactionHistory(); // Print transaction details
        System.out.println(); // Empty line for separation
        
        
        // --- 5. Test Invoice Class ---
        Invoice invoice = new Invoice(order, items, 50.0, 30.0); // Tax = 50, Discounts = 30
        System.out.println("Invoice Test:");
        System.out.println("Invoice ID: " + invoice.getInvoiceID());
        System.out.println("Invoice Date: " + invoice.getInvoiceDate());
        System.out.println("Total Amount: " + invoice.calculateTotalAmount());
        invoice.generateInvoice(); // Generate invoice (calculates total amount)
        invoice.printInvoice(); // Print full invoice details

    }
}
