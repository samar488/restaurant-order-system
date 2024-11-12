/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author pc
 */
public class Item {
     private String itemId;     // Unique identifier for the item
    private String name;       // Name of the item (e.g., "Burger", "Pizza")
    private String category;   // Category of the item (e.g., "Main Course", "Dessert")
    private double price;      // Price of the item
    private String description; // Description of the item (optional)
    
    // Constructor 
    public Item(String itemId, String name, String category, double price, String description) {
        this.itemId = itemId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }
// Getter and Setter
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //metode 1
  public void updatePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("The price of " + name + " has been updated to: " + newPrice);
    }
  //Methode 2
  // Method to update the description of the item
    public void updateDescription(String newDescription) {
        this.description = newDescription;
        System.out.println("The description of " + name + " has been updated.");
    }
     // Method to display item information (for testing)
    public void displayItemInfo() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }
}
