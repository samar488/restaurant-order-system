
package models;

import java.util.ArrayList;
import java.util.List;

public class category{
    private String categoryName;
    private List<Item> items;

    // Constructor to initialize the category with a name
    public category(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
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
        this.categoryName = categoryName;
    }
    
    // Method to add an item to the category
    public void addItemToCategory(Item item) {
        items.add(item);
        System.out.println("Item added to category.");
    }

    // Method to remove an item from the category
    public void removeItemFromCategory(Item item) {
        items.remove(item);
        System.out.println("Item removed from category.");
    }

    // Display all items in the category
    public void displayItems() {
        System.out.println("Items in category " + categoryName + ":");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}

