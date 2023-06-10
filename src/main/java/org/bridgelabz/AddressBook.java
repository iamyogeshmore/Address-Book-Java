package org.bridgelabz;

import java.util.Scanner;

public class AddressBook {
    public void addContact() {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please enter the first name: ");
        String firstName = scanner.next();

        System.out.print(" Please enter the last name: ");
        String lastName = scanner.next();

        System.out.print(" Please enter the address: ");
        String address = scanner.next();

        System.out.print(" Please enter the city: ");
        String city = scanner.next();

        System.out.print(" Please enter the state: ");
        String state = scanner.next();

        System.out.print(" Please enter the zip: ");
        int zip = scanner.nextInt();

        System.out.print(" Please enter the phone number: ");
        long phone = scanner.nextLong();

        System.out.print(" Please enter the email: ");
        String email = scanner.next();

        // Creating a new object of the contact class with the parameter values filled by user
        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phone, email);

    }
}