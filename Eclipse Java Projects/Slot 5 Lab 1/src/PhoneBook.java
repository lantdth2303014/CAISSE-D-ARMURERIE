import java.util.ArrayList;

public class PhoneBook extends Phone {
	
    private ArrayList<Contact> PhoneList;
    
    // le constructor:
    public PhoneBook() {
        setPhoneList(new ArrayList<Contact>());
    }
    
    // getter:
    public ArrayList<Contact> getPhoneList() {
		return PhoneList;
	}
    
    // setter:
	public void setPhoneList(ArrayList<Contact> phoneList) {
		PhoneList = phoneList;
	}
	
	// Insert Phone Method:
    @Override
    void insertPhone(String name, String phone) {
        
    	// TLDR: Search and compare every "entry" (every "x" in Contact)  in the "PhoneList" ArrayList 
    	//            that has the SAME "name" with the one in the parameter, 
    	//            ex: phoneBook.insertPhone("the one", "123-456-7890");
    	
    	//            If a matching is found, sets "existingEntry" to that "entry" and breaks out of the loop 
    	// 			since there's no need to continue searching
    	
    	
    	Contact existingEntry = null;          // Create "existingEntry" variable to vibe check the "entry" variable
        
        
        for (Contact entry : getPhoneList()) {          // for Contact "entry" (aka for each Contact) in the "ArrayList<Contact> named PhoneList"      			
        	if (entry.getName().equals(name)) { 
                existingEntry = entry;
                break;
            }
        }
        
        if (existingEntry != null) {												// if existingEntry isn't null (aka if a matching is found)
            if (!existingEntry.getPhone().contains(phone)) {          // check if the "phone" (phone number) is NOT in the list
                existingEntry.getPhone().add(phone);						// if TRUE: adds the "phone" number to the list of entry's phone number
            }
        } 
        else {																			          // else = there's no matching and the "entry" is a new Contact
            ArrayList<String> newPhoneList = new ArrayList<>();          // Create a new phone list with the provided phone number
            newPhoneList.add(phone);
            
            getPhoneList().add(new Contact(name, newPhoneList));       // Create a new Contact with the specified name and the new phone list
        }
    }
    
    // Remove Phone Method:
    @Override
    void removePhone(String name) {
        getPhoneList().removeIf(entry -> entry.getName().equals(name));
    }
    
    // Update Phone Method:
    @Override
    void updatePhone(String name, String oldPhone, String newPhone) {
        for (Contact entry : getPhoneList()) {
            if (entry.getName().equals(name) && entry.getPhone().contains(oldPhone)) {
                entry.getPhone().remove(oldPhone);
                entry.getPhone().add(newPhone);
                break;
            }
        }
    }
    
    // Search Phone Method:
    @Override
    Contact searchPhone(String name) {
        for (Contact entry : getPhoneList()) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }
    
    // Sort Method:
    @Override
    void sort() {
        getPhoneList().sort((entry1, entry2) -> entry1.getName().compareTo(entry2.getName()));
    }
}