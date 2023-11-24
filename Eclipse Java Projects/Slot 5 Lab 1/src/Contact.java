import java.util.ArrayList;

public class Contact {
	
    private String name;
    private ArrayList<String> phone;
    
    // le constructor:
    public Contact(String name, ArrayList<String> phone) {
        this.setName(name);
        this.setPhone(phone);
    }
    
    // getters:
    public String getName() {
        return name;
    }
    
    public ArrayList<String> getPhone() {
        return phone;
    }
    
    // setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }
}