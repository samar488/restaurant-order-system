
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
        menu.addItem(item);
        System.out.println("Admin added item: " + item.getName());
    }

//    public void removeMenuItem(Menu menu, Item item) {
//        boolean isRemoved = false;
//        menu.removeItem(item, isRemoved);
//        if (isRemoved) {
//            System.out.println("Admin removed item: " + item.getName());
//        } else {
//            System.out.println("Item not found in menu.");
//        }
//    }
    
    public void removeMenuItem(Menu menu, Item item) {
    menu.removeItem(item);  // Call the removeItem method in Menu
    // Here, you can add any additional logic if needed to handle success or failure
    // based on the print statements in the removeItem method.
    // The actual success or failure is already printed in the removeItem method.
    System.out.println("Admin attempted to remove item: " + item.getName());
}

    public void updateMenuItem(Menu menu, Item item, double newPrice) {
        item.setPrice(newPrice);
        System.out.println("Admin updated item: " + item.getName() + " to new price: " + newPrice);
    }


    /*
    // Method for Viewing Reports
    public void viewReports(Report report) {
        report.generateReport();
        System.out.println("Report viewed by Admin.");
    }
    */

    
}