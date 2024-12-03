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

public class Menu {
    private List<Item> items;

    
    public Menu() {
        this.items = new ArrayList<>();
    }

    
    protected void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        items.add(item);
        System.out.println(item.getName() + " has been added to the menu.");
    }

    
    protected void removeItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        if (items.remove(item)) {
            System.out.println(item.getName() + " has been removed from the menu.");
        } else {
            System.out.println(item.getName() + " is not found in the menu.");
        }
    }

    
    protected void updateItem(Item item, double newPrice) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        if (newPrice <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0.");
        }
        if (items.contains(item)) {
            item.setPrice(newPrice);
            System.out.println(item.getName() + " has been updated with a new price.");
        } else {
            System.out.println(item.getName() + " is not found in the menu.");
        }
    }

    
    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}
