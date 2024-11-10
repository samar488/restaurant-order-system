/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

public class Discount {

    // Data Members
    private double discountPercentage;
    private String discountCode;
    private Date validUntil;

    // Constructor
    public Discount(double discountPercentage, String discountCode, Date validUntil) {
        this.discountPercentage = discountPercentage;
        this.discountCode = discountCode;
        this.validUntil = validUntil;
    }

    // Method to apply the discount to an order
    public void applyDiscount(Order order) {
        if (isValid()) {
            order.applyDiscount(this); // Apply discount to the order if it's valid
        }
    }

    // Method to check if the discount is still valid
    public boolean isValid() {
        Date currentDate = new Date(); // Get current date
        return !currentDate.after(validUntil); // Check if the current date is before the discount expiration date
    }

    // Getter for discountPercentage
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    // Getter for discountCode
    public String getDiscountCode() {
        return discountCode;
    }

    // Setter for discountPercentage
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    // Setter for discountCode
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    // Setter for validUntil
    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    // Optional: toString method to print Discount details
    @Override
    public String toString() {
        return "Discount Code: " + discountCode + ", Percentage: " + discountPercentage + "%, Valid Until: " + validUntil;
    }
}

