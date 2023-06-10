package org.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("\n Welcome to Address Book System");
        Scanner scanner = new Scanner(System.in);
        AddressBook addBook = new AddressBook();
        String ch;
        while (true) {
            System.out.println(" **** MENU ****");
            System.out.println(" 1. Add contacts\n 2. Display contacts \n 3. Exit");
            System.out.print("\n Please enter your choice: ");

            ch = scanner.next();

            switch (ch) {
                case "1":
                    addBook.addContact();
                    break;
                case "2":
                    addBook.displayContacts();
                    break;

                case "3":
                    System.out.println(" Exit");
                    return;
                default:
                    System.out.println(" Please enter a valid choice: ");
            }
        }
    }
}