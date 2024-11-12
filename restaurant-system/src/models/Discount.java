/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

public class Discount {
    private double discountPercentage;
    private String discountCode;
    private Date validUntil;

    // Constructor
    public Discount(double discountPercentage, String discountCode, Date validUntil) {
        this.discountPercentage = discountPercentage;
        this.discountCode = discountCode;
        this.validUntil = validUntil;
    }

    // Check if the discount is valid
    public boolean isValid() {
        Date currentDate = new Date();
        return currentDate.before(validUntil);
    }

    // Apply discount to an order
    public void applyDiscount(Order order) {
        if (isValid()) {
            double discountAmount = order.getTotalPrice() * (discountPercentage / 100);
            double newTotalPrice = order.getTotalPrice() - discountAmount;
            order.setTotalPrice(newTotalPrice);
            System.out.println("Discount of " + discountPercentage + "% applied. New total price: " + newTotalPrice);
        } else {
            System.out.println("Discount is not valid.");
        }
    }

    // Getters and setters if needed

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }
    
}


