/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDateTime;

public class PaymentTransaction {
    // Data Members
    private int paymentTransactionID;
    private Order order;
    private String paymentMethod;
    private double amount;
    private double totalCost;
    private String transactionType;
    private String transactionStatus;
    private LocalDateTime transactionDate; // Updated to use LocalDateTime
    private boolean isDiscountApplied;

    // Constructor
    public PaymentTransaction(Order order, String paymentMethod, double amount, String transactionType) {
        this.paymentTransactionID = generateTransactionID();
        this.order = order;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionStatus = "PENDING";
        this.transactionDate = LocalDateTime.now(); // Set current date and time
        this.isDiscountApplied = false;
        this.totalCost = calculateTotalCost();
    }

    // Method to apply a discount
    public void discountApplied(double discountPercentage) {
        if (!isDiscountApplied) {
            double discountAmount = (totalCost * discountPercentage) / 100;
            totalCost -= discountAmount;
            isDiscountApplied = true;
        }
    }

    // Method to process the payment
    public void paymentProcess() {
        // Logic to process the payment based on the payment method
        if ("CreditCard".equalsIgnoreCase(paymentMethod) || "PayPal".equalsIgnoreCase(paymentMethod)) {
            // Simulate payment process (This would typically involve integration with a payment gateway)
            transactionStatus = "COMPLETED";
        } else {
            transactionStatus = "FAILED";
        }
    }

    // Method to display transaction history
    public void transactionHistory() {
        // Logic to display transaction details (could be integrated with a database or console output)
        System.out.println("Transaction ID: " + paymentTransactionID);
        System.out.println("Order ID: " + order.getOrderID());
        System.out.println("Amount: $" + amount);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Transaction Status: " + transactionStatus);
        System.out.println("Transaction Date: " + transactionDate); // LocalDateTime includes date and time
    }

    // Method to generate a unique transaction ID
    private int generateTransactionID() {
        return (int) (Math.random() * 100000); // Simplified for example purposes
    }

    // Method to calculate total cost
    private double calculateTotalCost() {
        return amount; // In practice, this could include fees, taxes, etc.
    }

    // Getters and Setters
    public int getPaymentTransactionID() {
        return paymentTransactionID;
    }

    public Order getOrder() {
        return order;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public LocalDateTime getTransactionDate() { // Updated getter
        return transactionDate;
    }

    public boolean isDiscountApplied() {
        return isDiscountApplied;
    }
}
