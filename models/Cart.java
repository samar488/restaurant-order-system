
package com.mycompany.cart;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @Mohamed Yasser
 */
public class Cart {
    
    // Attributes
    private int cartID;
    private User user; // Reference to the associated User
    private List<Item> cartItems; // List to store items added to the cart

    // Constructor
    public Cart(int cartID, User user) {
        this.cartID = cartID;
        this.user = user;
        this.cartItems = new ArrayList<>(); // Initialize an empty cart
    }

    // Method to add an item to the cart
    public void addItem(Item item) {
        cartItems.add(item);
        System.out.println(item.getName() + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(Item item) {
        if (cartItems.contains(item)) {
            cartItems.remove(item);
            System.out.println(item.getName() + " removed from the cart.");
        } else {
            System.out.println(item.getName() + " is not in the cart.");
        }
    }

    // Method to calculate the total cost of items in the cart
    public double calculateTotal() {
        double total = 0;
        for (Item item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }

    // Method to apply a discount (if applicable)
    public double applyDiscount(double discountPercentage) {
        double total = calculateTotal();
        double discount = total * (discountPercentage / 100);
        return total - discount;
    }

    // Method to clear the cart
    public void clearCart() {
        cartItems.clear();
        System.out.println("Cart has been cleared.");
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Items in the cart:");
        for (Item item : cartItems) {
            System.out.println("- " + item.getName() + " : " + item.getPrice());
        }
    }

    // Getters and Setters
    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<Item> cartItems) {
        this.cartItems = cartItems;
    }
    
}
