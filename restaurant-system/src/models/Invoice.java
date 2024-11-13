/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;
import java.util.List;

public class Invoice {

    private int invoiceID;
    private Order order;
    private LocalDateTime invoiceDate; // Updated to use LocalDateTime
    private double totalAmount;
    private List<Item> itemizedDetails;
    private double taxAmount;
    private double discountsApplied;

    public Invoice(Order order, List<Item> itemizedDetails, double taxAmount, double discountsApplied) {
        this.order = order;
        this.itemizedDetails = itemizedDetails;
        this.taxAmount = taxAmount;
        this.discountsApplied = discountsApplied;
        this.invoiceDate = LocalDateTime.now(); // Set current date and time as invoice date
        this.generateInvoiceID();
    }

    // Method to generate invoice ID
    private void generateInvoiceID() {
        // Logic to generate unique invoice ID (can be sequential or random)
        this.invoiceID = (int) (Math.random() * 10000); // Simple example of random generation
    }

    // Method to calculate total amount (items + tax - discounts)
    public double calculateTotalAmount() {
        double itemsTotal = 0;
        for (Item item : itemizedDetails) {
            itemsTotal += item.getPrice();
        }
        totalAmount = itemsTotal + taxAmount - discountsApplied;
        return totalAmount;
    }

    // Method to generate the invoice
    public void generateInvoice() {
        this.calculateTotalAmount(); // Ensure the total amount is calculated before generating
        // Logic for generating invoice (could involve saving to a database or other processes)
    }

    // Method to print the invoice (just an example, could be more detailed)
    public void printInvoice() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Order ID: " + order.getOrderID());
        System.out.println("Invoice Date: " + invoiceDate); // Prints the LocalDateTime
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Discounts Applied: " + discountsApplied);
        System.out.println("Itemized Details: ");
        for (Item item : itemizedDetails) {
            System.out.println("- " + item.getName() + " | Price: " + item.getPrice());
        }
    }

    // Getter methods
    public int getInvoiceID() {
        return invoiceID;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getInvoiceDate() { // Updated getter
        return invoiceDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<Item> getItemizedDetails() {
        return itemizedDetails;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public double getDiscountsApplied() {
        return discountsApplied;
    }
}

