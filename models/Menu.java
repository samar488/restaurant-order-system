/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_project;

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

    
    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.getName() + " has been added to the menu.");
    }

    
    public void removeItem(Item item) {
        if (items.remove(item)) {
            System.out.println(item.getName() + " has been removed from the menu.");
        } else {
            System.out.println(item.getName() + " is not found in the menu.");
        }
    }

    
    public void updateItem(Item item, double newPrice) {
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
