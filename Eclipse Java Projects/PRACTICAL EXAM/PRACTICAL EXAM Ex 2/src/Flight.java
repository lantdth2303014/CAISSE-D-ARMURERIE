
public class Flight {
	
	private int number;
    private String destination;

    // default constructor
    public Flight() {
        this.number = 0;
        this.destination = "";
    }

    // le constructor
    public Flight(int number, String destination) {
        // Check for valid number, assume safe empty state otherwise
        if (number > 0) {
            this.number = number;
            this.destination = destination;
        } 
        else {
            this.number = 0;
            this.destination = "";
        }
    }
    
    // Getter for number
    public int getNumber() {
        return number;
    }
    
    // Getter for destination
    public String getDestination() {
        return destination;
    }

    // Display method
    public void display() {
        System.out.println(number + ", " + destination);
    }
    
}
