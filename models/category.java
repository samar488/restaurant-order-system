/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author pc
 */


import java.util.ArrayList;
import java.util.List;

public class category{
    private String categoryName;
    private List<Item> items;

    // Constructor to initialize the category with a name
    public category(String categoryName) {
        if (categoryName == null || categoryName.isEmpty()) {
        throw new IllegalArgumentException("Category name cannot be null or empty.");
    }
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
//        setCategoryName(categoryName);
    }


    // Get all items in the category
    public List<Item> getItems() {
        return items;
    }

    // Get and Set category name
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
         if (categoryName == null || categoryName.isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be null or empty.");
        }
        this.categoryName = categoryName;
    }
    
    // Method to add an item to the category
    public void addItemToCategory(Item item) {
         if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
          if (items.contains(item)) {
            System.out.println("Item already exists in the category.");
            return;
        }
        items.add(item);
        System.out.println("Item added to category.");
    }

    // Method to remove an item from the category
    public void removeItemFromCategory(Item item) {
         if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
         if (!items.contains(item)) {
            System.out.println("Item not found in the category.");
            return;
        }
        items.remove(item);
        System.out.println("Item removed from category.");
    }

    // Display all items in the category
    public void displayItems() {
         if (items.isEmpty()) {
            System.out.println("No items in category: " + categoryName);
            return;
        }
        System.out.println("Items in category " + categoryName + ":");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}

