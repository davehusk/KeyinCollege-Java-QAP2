// Address.java
// This class models an address with street, city, state, and zip code.

public class Address {
    private String street;   // The street address.
    private String city;     // The city.
    private String state;    // The state.
    private String zipCode;  // The zip code.

    // Constructor to initialize the address.
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Returns a string representation of the address.
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}
