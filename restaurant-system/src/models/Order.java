/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Mahmoud Ashraf
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private User user;
    private List<Item> orderItems;
    private double totalPrice;
    private Address deliveryAddress;
    private OrderStatues orderStatus;

    // Constructor
    public Order(int orderID, User user, List<Item> orderItems, Address deliveryAddress) {
         if (user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }
        if (orderItems == null || orderItems.isEmpty()) {
            throw new IllegalArgumentException("Order must contain at least one item.");
        }
        if (deliveryAddress == null) {
            throw new IllegalArgumentException("Delivery address cannot be null.");
        }
        
        this.orderID = orderID;
        this.user = user;
        this.orderItems = new ArrayList<>(orderItems);
        this.deliveryAddress = deliveryAddress;
        this.orderStatus = OrderStatues.PENDING;
        this.totalPrice = calculateTotalPrice();
    }

    public int getOrderID() {
        return orderID;
    }

    public User getUser() {
        return user;
    }

    public List<Item> getOrderItems() {
        return new ArrayList<>(orderItems);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public OrderStatues getOrderStatus() {
        return orderStatus;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null.");
        }
        this.user = user;
    }

    public void setOrderItems(List<Item> orderItems) {
        if (orderItems == null || orderItems.isEmpty()) {
            throw new IllegalArgumentException("Order must contain at least one item.");
        }
        this.orderItems = new ArrayList<>(orderItems);
        this.totalPrice = calculateTotalPrice(); // Recalculate total price when items are updated
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        if (deliveryAddress == null) {
            throw new IllegalArgumentException("Delivery address cannot be null.");
        }
        this.deliveryAddress = deliveryAddress;
    }

    public void setOrderStatues(OrderStatues orderStatus) {
        if (orderStatus == null) {
            throw new IllegalArgumentException("Order status cannot be null.");
        }
        this.orderStatus = orderStatus;
    }
    
    public static Order createOrder(int orderID, User user, List<Item> items, Address address) {
        if (user == null || items == null || items.isEmpty() || address == null) {
            throw new IllegalArgumentException("Invalid inputs for creating an order.");
        }
        return new Order(orderID, user, items, address);
    }

    
    public void cancelOrder() {
        if (this.orderStatus == OrderStatues.PENDING) {
            this.orderStatus = OrderStatues.CANCELLED;
            System.out.println("Order " + orderID + " has been cancelled.");
        } else {
            throw new IllegalStateException("Order " + orderID + " cannot be cancelled because it is not in PENDING status.");
        }
    }

    
    public void updateOrderStatus(OrderStatues status) {
         if (status == null) {
            throw new IllegalArgumentException("Order status cannot be null.");
        }
        this.orderStatus = status;
        System.out.println("Order " + orderID + " status updated to " + status);
    }

    
    private double calculateTotalPrice() {
        double total = 0.0;
        for (Item item : orderItems) {
            if (item == null) {
                throw new IllegalArgumentException("Order contains a null item.");
            }
            total += item.getPrice();
        }
        return total;
    }

}
