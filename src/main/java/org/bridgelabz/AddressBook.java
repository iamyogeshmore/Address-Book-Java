package org.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static ArrayList<Contact> addressBook = new ArrayList<Contact>();

    public Contact inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the first name: ");
        String firstName = scanner.next();

        System.out.print(" Enter the last name: ");
        String lastName = scanner.next();

        System.out.print(" Enter the address: ");
        String address = scanner.next();

        System.out.print(" Enter the city: ");
        String city = scanner.next();

        System.out.print(" Enter the state: ");
        String state = scanner.next();

        System.out.print(" Enter the zip: ");
        int zip = scanner.nextInt();

        System.out.print(" Enter the phone number: ");
        long phone = scanner.nextLong();

        System.out.print(" Enter the email: ");
        String email = scanner.next();

        // Creating a new object of the contact class with the parameter values filled by user
        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);
        return contact;
    }

    public void addContact() {     // Method to create an object of Contact class with user input
        addressBook.add(inputDetails());
    }

    public void displayContacts() {
        for (Contact contact : addressBook) {
            System.out.println(contact);
        }
    }
}