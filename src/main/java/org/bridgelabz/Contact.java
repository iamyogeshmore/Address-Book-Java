package org.bridgelabz;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phone;
    String email;

    public Contact(String firstName, String lastName, String address, String city, String state, int zip, long phone, String email) {     // Parameterized class for creating object
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "]";
    }
}
