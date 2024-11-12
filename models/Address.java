package restaurant.orders;

public class Address {
    private String street;
    private String city;
    private String postalCode;
    private String country;

    // Constructor to initialize the address fields
    public Address(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }
    


    // Getters and Setters for each address field
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
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


