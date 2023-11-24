
public abstract class Phone {
    
    // Abstract method to insert a phone entry
    abstract void insertPhone(String name, String phone);
    
    // Abstract method to remove a phone entry
    abstract void removePhone(String name);
    
    // Abstract method to update a phone entry
    abstract void updatePhone(String name, String oldPhone, String newPhone);
    
    // Abstract method to search for a phone entry
    abstract Contact searchPhone(String name);
    
    // Abstract method for sorting the phone entries
    abstract void sort();
}