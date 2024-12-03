
package models;
import java.util.Date;

/*
    @author moham
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
        this.deliveryStatus = "Preparing";  // Default initial status
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

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    // Methods
    public void updateDeliveryStatus(String newStatus) {
        try {
            if (newStatus == null || newStatus.isEmpty()) {
                throw new IllegalArgumentException("Status cannot be null or empty");
            }
            this.deliveryStatus = newStatus;
            System.out.println("Delivery status updated to: " + newStatus);
        } catch (IllegalArgumentException e) {
            System.err.println("Error updating delivery status: " + e.getMessage());
        }
    }

    public void calculateEstimatedDeliveryTime() {
        try {
            if (order == null) {
                throw new IllegalStateException("Order cannot be null to calculate delivery time");
            }
            Date currentTime = new Date();
            long estimatedTime = currentTime.getTime() + (2 * 60 * 60 * 1000); // Adds 2 hours
            this.estimatedDeliveryTime = new Date(estimatedTime);
            System.out.println("Estimated delivery time set to: " + estimatedDeliveryTime);
        } catch (IllegalStateException e) {
            System.err.println("Error calculating estimated delivery time: " + e.getMessage());
        }
    }
}


/*
    public enum DeliveryStatus {
        PENDING,
        DISPATCHED,
        IN_TRANSIT,
        DELIVERED,
        CANCELLED
    }
*/
