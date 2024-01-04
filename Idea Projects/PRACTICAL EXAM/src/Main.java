import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<String, Contact> contacts = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContactByName();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting Address Book. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        } while (choice != 4);
    }

    // Main methods:
    private static void addContact() {
        System.out.print("Enter person's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter person's phone number: ");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber);
        contacts.put(name, contact);
        System.out.println("Contact added successfully!");
    }

    private static void findContactByName() {
        System.out.print("Enter person's name to find: ");
        String name = scanner.nextLine();

        Contact contact = contacts.get(name);
        if (contact != null) {
            System.out.println("Phone number of " + name + ": " + contact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Address Book is empty.");
        } else {
            System.out.println("Contacts in the Address Book:");
            for (Map.Entry<String, Contact> entry : contacts.entrySet()) {
                Contact contact = entry.getValue();
                System.out.println("Name: " + contact.getName() + ", Phone: " + contact.getPhoneNumber());
            }
        }
    }
}
