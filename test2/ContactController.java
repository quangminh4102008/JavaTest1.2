package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactController {
         Scanner scanner = new Scanner(System.in);
         ArrayList<Contact> contacts = new ArrayList<Contact>();
         public void createContact() {
             System.out.println("Please enter your name");
             String Name = scanner.nextLine();
             System.out.println("Please enter your Company");
             String Company = scanner.nextLine();
             System.out.println("Please enter your email");
             String Email = scanner.nextLine();
             System.out.println("Please enter your phone");
             String Phone = scanner.nextLine();
             Contact contact1 = new Contact(Name, Company, Email, Phone);
             contact1.getName();
             contact1.getCompany();
             contact1.getEmail();
             contact1.getPhone();
             contacts.add(contact1);
         }
         public void findTeleByName() {
             System.out.println("Please enter name to find: ");
             String name = scanner.nextLine();
             for (Contact contact : contacts) {
                 if(contact.getName().equals(name)) {
                     System.out.println("Phone number: " + contact.getPhone());
                     return;
                 }
             }
             System.out.println("Cant find the telephone number");
         }
         public void Displaycontacts(){
             for (Contact contact : contacts) {
                 System.out.printf("%-30s || %-30s || %-30s || %-30s || %-30s","Name","Company","Email","Phone");
                 for(int i = 0; i < contacts.size(); i++){
                     Contact ct = contacts.get(i);
                     System.out.printf("%-30s || %-30s || %-30s || %-30s || %-30s",ct.getName(),ct.getCompany(),ct.getEmail(),ct.getPhone());
                 }
             }
         }
}
