/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;

public class Discount {
    private double discountPercentage;
    private String discountCode;
    private LocalDate validUntil;

    // Constructor
    public Discount(double discountPercentage, String discountCode, LocalDate validUntil) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
        }
        if (validUntil == null || validUntil.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Valid until date must be a future date.");
        }
        this.discountPercentage = discountPercentage;
        this.discountCode = discountCode;
        this.validUntil = validUntil;
    }

    // Method to check if the discount is valid
    public boolean isValid() {
        LocalDate currentDate = LocalDate.now(); // Current date without time
        return currentDate.isBefore(validUntil);
    }

    // Method to apply the discount to an order
    public void applyDiscount(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null.");
        }
        if (isValid()) {
            double originalPrice = order.getTotalPrice();
            if (originalPrice <= 0) {
                throw new IllegalArgumentException("Order total price must be greater than 0.");
            }
            double discountAmount = originalPrice * (discountPercentage / 100);
            double newPrice = originalPrice - discountAmount;
            order.setTotalPrice(newPrice);
            System.out.println("Discount of " + discountPercentage + "% applied. New total price: " + newPrice);
        } else {
            System.out.println("Discount is not valid. No discount applied.");
        }
    }

    // Getters and Setters
    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
        }
        this.discountPercentage = discountPercentage;
    }

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        if (discountCode == null || discountCode.isBlank()) {
            throw new IllegalArgumentException("Discount code cannot be null or empty.");
        }
        this.discountCode = discountCode;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        if (validUntil == null || validUntil.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Valid until date must be a future date.");
        }
        this.validUntil = validUntil;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "discountPercentage=" + discountPercentage +
                ", discountCode='" + discountCode + '\'' +
                ", validUntil=" + validUntil +
                '}';
    }
}
