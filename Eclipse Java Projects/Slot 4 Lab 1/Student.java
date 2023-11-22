import java.util.InputMismatchException;
import java.util.Scanner;

public class Student extends Person {
	
	private String id;
	private double mark;
	private String email;
	
	// le default constructor
	public Student() {
		
	}
	
	// le constructor
	public Student(String name, String gender, String DoB, String address, String id, double mark, String email) {
        super(name, gender, DoB, address);
        this.setId(id);
        this.setMark(mark);
        this.setEmail(email);
    }
	
	// Getters
	public String getId() {
		return id;
	}
		
	public double getMark() {
		return mark;
	}
		
	public String getEmail() {
		return email;
	}
	
	// Setters
	public void setId(String id) {
		this.id = id;
	}
		
	public void setMark(double mark) {
		this.mark = mark;
	}
		
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Enter information method
	@Override
    public void enterInfo() {
        super.enterInfo();  

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        setId(scanner.nextLine());
        
        System.out.print("Enter student email: ");
        setEmail(scanner.nextLine());

        try {
            System.out.print("Enter student mark: ");
            setMark(scanner.nextDouble());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric value for the mark.");
            scanner.nextLine();  // Consume the newline character
        }
    }
	
	// Print information method
	@Override
    public void printInfo() {
        super.printInfo();
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Mark: " + mark);
    }
	
	// Check for scholarship method
	public void checkScholar() {
		if(mark >= 8.0) {
			System.out.println();
			System.out.println("The student earned a scholarship");
		}
		else{
			System.out.println();
			System.out.println("The student isn't qualified for a scholarship");
		}
	}
}
