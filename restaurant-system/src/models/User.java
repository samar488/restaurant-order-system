/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class User {
    //// Attributes
    private String name;
    private String userID;
    private String username;
    private String password;
    private Address address;
    private boolean isEliteCustomer;  // True if the user is subscribed to Elite service
    private List<Order> orderHistory; // List to store orders placed by the user
// Constructor
    public User(String name, String userID, String username, String password, Address address) {
        this.name = name;
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.address = address;
        this.isEliteCustomer = false;  // Default is not Elite
        this.orderHistory = new ArrayList<>();
    }

    // Getter and Setter methods 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isEliteCustomer() {
        return isEliteCustomer;
    }

    public void setEliteCustomer(boolean isEliteCustomer) {
        this.isEliteCustomer = isEliteCustomer;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }
    // Methods
     //Method 1 (Subscribe to Elite service)
     public void subscribeToElite() {
        if (!isEliteCustomer) {
            isEliteCustomer = true;
            System.out.println("You are now an Elite Customer! Enjoy your 10% discount on future orders.");
        } else {
            System.out.println("You are already an Elite Customer.");
        }
    }
//Method 2(  Update profile details)
 public void updateProfile(Address newAddress, String newPassword) {
        this.address = newAddress;
        this.password = newPassword;
        System.out.println("Profile updated successfully.");
    }
 //Method 2(Update order history)
 public void updateHistory(Order newOrder) {
        this.orderHistory.add(newOrder);
        System.out.println("Order history updated.");
    }
    // Print user info (for testing)
    public void printUserInfo() {
        System.out.println("User Info:");
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Address: " + address);
        System.out.println("Elite Status: " + (isEliteCustomer ? "Yes" : "No"));
        System.out.println("Order History: ");
        for (Order order : orderHistory) {
            System.out.println("  - Order ID: " + order.getOrderID() + ", Total Price: " + order.getTotalPrice());
        }
    }
}

