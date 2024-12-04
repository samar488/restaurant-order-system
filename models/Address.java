/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

public class Address {
    private String street;
    private String city;
    private String postalCode;
    private String country;

    // Constructor to initialize the address fields
    public Address(String street, String city, String postalCode, String country) {
        if (street == null || street.isEmpty()) {
        throw new IllegalArgumentException("Street cannot be null or empty.");
    }
    if (city == null || city.isEmpty()) {
        throw new IllegalArgumentException("City cannot be null or empty.");
    }
    if (postalCode == null || postalCode.isEmpty()) {
        throw new IllegalArgumentException("Postal code cannot be null or empty.");
    }
    if (country == null || country.isEmpty()) {
        throw new IllegalArgumentException("Country cannot be null or empty.");
    }
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
//        setStreet(street);
//        setCity(city);
//        setPostalCode(postalCode);
//        setCountry(country);
    }
    


    // Getters and Setters for each address field
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
         if (street == null || street.isEmpty()) {
            throw new IllegalArgumentException("Street cannot be null or empty.");
        }
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            throw new IllegalArgumentException("City cannot be null or empty.");
        }
        this.city = city;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        if (postalCode == null || postalCode.isEmpty()) {
            throw new IllegalArgumentException("Postal code cannot be null or empty.");
        }
        this.postalCode = postalCode;
    }

    public String getCountry() {
        
        return country;
    }

    public void setCountry(String country) {
         if (country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Country cannot be null or empty.");
        }
        this.country = country;
    }

    // Validate the address fields
    public boolean validate() {
        boolean isValid = !street.isEmpty() && !city.isEmpty() && !postalCode.isEmpty() && !country.isEmpty();
        if (isValid) {
            System.out.println("Address is valid.");
        } else {
            System.out.println("Address is incomplete. Please fill all fields.");
        }
        return isValid;
//        try {
//            // Validate each field individually
//            setStreet(street);
//            setCity(city);
//            setPostalCode(postalCode);
//            setCountry(country);
//
//            System.out.println("Address is valid.");
//            return true;
//        } catch (IllegalArgumentException e) {
//            System.out.println("Address validation failed: " + e.getMessage());
//            return false;
//        }
    }
    
// Override toString method to display the address
  
    @Override
    public String toString() {
    return "Address:\n" +
           "Street: " + street + "\n" +
           "City: " + city + "\n" +
           "Postal Code: " + postalCode + "\n" +
           "Country: " + country;
   }

}

