
package models;
import java.util.ArrayList;
import java.util.List;

/*
    @author Mohamed Yasser
 */
public class Cart {

    // Attributes
    private int cartID;
    private User user; 
    private List<Item> cartItems; 

    // Constructor
    public Cart(int cartID, User user) {
        this.cartID = cartID;
        this.user = user;
        this.cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(Item item) {
        try {
            if (item == null) {
                throw new IllegalArgumentException("Item cannot be null");
            }
            cartItems.add(item);
            System.out.println(item.getName() + " added to the cart.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error adding item to cart: " + e.getMessage());
        }
    }

    // Method to remove an item from the cart
    public void removeItem(Item item) {
        try {
            if (item == null) {
                throw new IllegalArgumentException("Item cannot be null");
            }
            if (!cartItems.contains(item)) {
                throw new ItemNotFoundException("Item not found in cart: " + item.getName());
            }
            cartItems.remove(item);
            System.out.println(item.getName() + " removed from the cart.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error removing item: " + e.getMessage());
        } catch (ItemNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    // Method to calculate the total cost of items in the cart
    public double calculateTotal() {
        try {
            if (cartItems.isEmpty()) {
                throw new EmptyCartException("Cart is empty, cannot calculate total");
            }
            double total = 0;
            for (Item item : cartItems) {
                total += item.getPrice();
            }
            return total;
        } catch (EmptyCartException e) {
            System.err.println(e.getMessage());
            return 0.0;
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

    // Custom exceptions
    public static class ItemNotFoundException extends Exception {
        public ItemNotFoundException(String message) {
            super(message);
        }
    }

    public static class EmptyCartException extends Exception {
        public EmptyCartException(String message) {
            super(message);
        }
    }
}
