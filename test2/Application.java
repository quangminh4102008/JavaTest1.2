package test2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        ContactController contactController = new ContactController();
        while (true) {
            System.out.println("Welcome to address book");
            System.out.println("==============================");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice(1-4)");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    contactController.createContact();
                    break;
                case 2:
                    contactController.findTeleByName();
                    break;
                case 3:
                    contactController.Displaycontacts();
                    break;
                case 4:
                    System.out.println("good bye");
                    break;
            }
            if(choice == 4) {
                break;
            }
        }
    }
}