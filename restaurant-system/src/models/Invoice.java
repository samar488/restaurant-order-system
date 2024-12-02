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
    private LocalDateTime invoiceDate;
    private double totalAmount;
    private List<Item> itemizedDetails;
    private double taxAmount;
    private double discountsApplied;

    public Invoice(Order order, List<Item> itemizedDetails, double taxAmount, double discountsApplied) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null.");
        }
        if (itemizedDetails == null || itemizedDetails.isEmpty()) {
            throw new IllegalArgumentException("Itemized details cannot be null or empty.");
        }
        if (taxAmount < 0 || discountsApplied < 0) {
            throw new IllegalArgumentException("Tax amount and discounts applied must be non-negative.");
        }

        this.order = order;
        this.itemizedDetails = itemizedDetails;
        this.taxAmount = taxAmount;
        this.discountsApplied = discountsApplied;
        this.invoiceDate = LocalDateTime.now();
        this.generateInvoiceID();
    }

    private void generateInvoiceID() {
        this.invoiceID = (int) (Math.random() * 10000);
    }

    public double calculateTotalAmount() {
        try {
            double itemsTotal = 0;
            for (Item item : itemizedDetails) {
                if (item == null) {
                    throw new IllegalArgumentException("Item in the itemized details cannot be null.");
                }
                itemsTotal += item.getPrice();
            }
            totalAmount = itemsTotal + taxAmount - discountsApplied;
            if (totalAmount < 0) {
                throw new IllegalArgumentException("Total amount cannot be negative.");
            }
            return totalAmount;
        } catch (IllegalArgumentException e) {
            System.err.println("Error calculating total amount: " + e.getMessage());
            throw e; // Rethrow the exception after logging it
        }
    }

    public void generateInvoice() {
        try {
            this.calculateTotalAmount(); // Ensure the total amount is calculated
            // Additional logic to save the invoice, e.g., to a database, can be added here.
        } catch (Exception e) {
            System.err.println("Error generating invoice: " + e.getMessage());
        }
    }

    public void printInvoice() {
        try {
            System.out.println("Invoice ID: " + invoiceID);
            System.out.println("Order ID: " + order.getOrderID());
            System.out.println("Invoice Date: " + invoiceDate);
            System.out.println("Total Amount: " + totalAmount);
            System.out.println("Tax Amount: " + taxAmount);
            System.out.println("Discounts Applied: " + discountsApplied);
            System.out.println("Itemized Details: ");
            for (Item item : itemizedDetails) {
                if (item == null) {
                    throw new IllegalArgumentException("Item in the itemized details cannot be null.");
                }
                System.out.println("- " + item.getName() + " | Price: " + item.getPrice());
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Error printing invoice: " + e.getMessage());
        }
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public Order getOrder() {
        return order;
    }

    public LocalDateTime getInvoiceDate() {
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


