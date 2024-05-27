// Person.java
// This class models a person with a first name, last name, and address.

public class Person {
    private String firstName;  // The first name.
    private String lastName;   // The last name.
    private Address address;   // The address.

    // Constructor to initialize the person.
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Returns a string representation of the person.
    @Override
    public String toString() {
        return firstName + " " + lastName + " " + address;
    }
}
