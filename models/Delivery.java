
package com.mycompany.delivery;
import java.util.Date;

/**
 *
 * @Mohamed Yasser
 */
public class Delivery {

    // Fields
    private int deliveryID;
    private Order order;
    private Address deliveryAddress;
    private Date estimatedDeliveryTime;
    private String deliveryStatus;

    // Constructor
    public Delivery(int deliveryID, Order order, Address deliveryAddress, Date estimatedDeliveryTime) {
        this.deliveryID = deliveryID;
        this.order = order;
        this.deliveryAddress = deliveryAddress;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.deliveryStatus = DeliveryStatus.PENDING;
    }

    // Getters and Setters
    public int getDeliveryID() {
        return deliveryID;
    }

    public Order getOrder() {
        return order;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Date getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(Date estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    // Methods
    public void updateDeliveryStatus(DeliveryStatus newStatus) {
        this.deliveryStatus = newStatus;
        System.out.println("Delivery status updated to: " + newStatus);
    }

    public void calculateEstimatedDeliveryTime() {
        // Example: setting delivery time based on the current time
        Date currentTime = new Date();
        long estimatedTime = currentTime.getTime() + (2 * 60 * 60 * 1000); // Adds 2 hours
        this.estimatedDeliveryTime = new Date(estimatedTime);
        System.out.println("Estimated delivery time set to: " + estimatedDeliveryTime);
    }

}


// Additional Part 

//public enum DeliveryStatus {
//    PENDING,
//    DISPATCHED,
//    IN_TRANSIT,
//    DELIVERED,
//    CANCELLED
//}