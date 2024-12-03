
package models;
import java.util.List;

/*
    @author Mohamed Yasser
*/
public class Admin {

    // Fields
    private int adminID;
    private String name;
    private String email;

    // Constructor
    public Admin(int adminID, String name, String email) {
        this.adminID = adminID;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Methods for Menu Management
    public void addMenuItem(Menu menu, Item item) {
        try {
            if (menu == null || item == null) {
                throw new IllegalArgumentException("Menu or item cannot be null");
            }
            menu.addItem(item);
            System.out.println("Admin added item: " + item.getName());
        } catch (IllegalArgumentException e) {
            System.err.println("Error adding item to menu: " + e.getMessage());
        }
    }

    public void removeMenuItem(Menu menu, Item item) {
        try {
            if (menu == null || item == null) {
                throw new IllegalArgumentException("Menu or item cannot be null");
            }
            menu.removeItem(item);
            System.out.println("Admin attempted to remove item: " + item.getName());
        } catch (IllegalArgumentException e) {
            System.err.println("Error removing item from menu: " + e.getMessage());
        }
    }

    public void updateMenuItem(Menu menu, Item item, double newPrice) {
        try {
            if (menu == null || item == null) {
                throw new IllegalArgumentException("Menu or item cannot be null");
            }
            if (newPrice <= 0) {
                throw new IllegalArgumentException("Price must be greater than 0");
            }
            item.setPrice(newPrice);
            System.out.println("Admin updated item: " + item.getName() + " to new price: " + newPrice);
        } catch (IllegalArgumentException e) {
            System.err.println("Error updating item price: " + e.getMessage());
        }
    }
}
