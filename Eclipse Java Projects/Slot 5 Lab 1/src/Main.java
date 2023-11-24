
public class Main {
    public static void main(String[] args) {
        
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.insertPhone("John", "123-456-7890");
        phoneBook.insertPhone("Jane", "987-654-3210");
        phoneBook.insertPhone("John", "555-555-5555");

        phoneBook.sort();

        Contact johnInfo = phoneBook.searchPhone("John");
        if (johnInfo != null) {
            System.out.println("Phone numbers for John: " + johnInfo.getPhone());
        }

        phoneBook.updatePhone("John", "123-456-7890", "999-999-9999");

        johnInfo = phoneBook.searchPhone("John");
        if (johnInfo != null) {
            System.out.println("Updated phone numbers for John: " + johnInfo.getPhone());
        }

        phoneBook.removePhone("Jane");

        phoneBook.sort();

        System.out.println("Phone book entries after removal:");
        for (Contact entry : phoneBook.getPhoneList()) {
            System.out.println(entry.getName() + ": " + entry.getPhone());
        }
    }
}