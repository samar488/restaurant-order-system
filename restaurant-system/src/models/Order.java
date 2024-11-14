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
        return orderItems;
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
        this.user = user;
    }

    public void setOrderItems(List<Item> orderItems) {
        this.orderItems = orderItems;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setOrderStatues(OrderStatues orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    public static Order createOrder(int orderID, User user, List<Item> items, Address address) {
        return new Order(orderID, user, items, address);
    }

    
    public void cancelOrder() {
        if (this.orderStatus == OrderStatues.PENDING) {
            this.orderStatus = OrderStatues.CANCELLED;
            System.out.println("Order " + orderID + " has been cancelled.");
        } else {
            System.out.println("Order " + orderID + " cannot be cancelled.");
        }
    }

    
    public void updateOrderStatus(OrderStatues status) {
        this.orderStatus = status;
        System.out.println("Order " + orderID + " status updated to " + status);
    }

    
    private double calculateTotalPrice() {
        double total = 0.0;
        for (Item item : orderItems) {
            total += item.getPrice();
        }
        return total;
    }

}
