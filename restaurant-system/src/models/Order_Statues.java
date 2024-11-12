/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author pc
 */
public class Order_Statues {
public enum Status {
       PENDING,      // Order is placed but not confirmed
        CONFIRMED,    // Order is confirmed and processing
        CANCELLED,    // Order has been cancelled
        DELIVERED     // Order has been delivered to the customer
    }

    // Variable to hold the current status of the order
    private Status currentStatus;
// Default constructor sets the initial status to PENDING
    public Order_Statues (){
        this.currentStatus = Status.PENDING;
    }
    // Constructor to initialize the status with a specific state
    public Order_Statues(Status initialStatus) {
        this.currentStatus = initialStatus;
    }

    // Getter method to get the current status of the order
    public Status getCurrentStatus() {
        return currentStatus;
    }

    // Setter method to set a new status for the order
    public void setCurrentStatus(Status newStatus) {
        this.currentStatus = newStatus;
    }
     // Method to change the order status to the next valid state in the workflow
    public void nextStatus() {
        switch (currentStatus) {
            case PENDING:
                currentStatus = Status.CONFIRMED;  // From Pending to Confirmed
                break;
            case CONFIRMED:
                currentStatus = Status.DELIVERED;  // From Confirmed to Delivered
                break;
            case DELIVERED:
                System.out.println("The order has already been delivered.");
                break;
            case CANCELLED:
                System.out.println("The order has been cancelled, no further action is possible.");
                break;
        }
    }
// Method to check if the order has been delivered
    public boolean isDelivered() {
        return currentStatus == Status.DELIVERED;
    }

    // Method to check if the order has been cancelled
    public boolean isCancelled() {
        return currentStatus == Status.CANCELLED;
    }

    // Override the toString() method to return a string representation of the order status
    @Override
    public String toString() {
        return "Current Order Status: " + currentStatus.name();
    }
    
    
}
