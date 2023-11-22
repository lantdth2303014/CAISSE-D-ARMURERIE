import java.util.Scanner;

public class Person {
	
	private String name;
	private String gender;
	private String DoB;
	private String address;
	
	// le default constructor
	public Person() {
		
	}
	
	// le constructor
	public Person(String name, String gender, String DoB, String address) {
		this.setName(name);
		this.setGender(gender);
		this.setDoB(DoB);
		this.setAddress(address);
	}
	
	// Getters
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getDoB() {
		return DoB;
	}
	
	public String getAddress() {
		return address;
	}
	
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setDoB(String DoB) {
		this.DoB = DoB;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// Enter information method
	public void enterInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        setName(scanner.nextLine());

        System.out.print("Enter gender: ");
        setGender(scanner.nextLine());

        System.out.print("Enter date of birth: ");
        setDoB(scanner.nextLine());

        System.out.print("Enter address: ");
        setAddress(scanner.nextLine());
    }
	
	// Print information method
	public void printInfo() {
		System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + DoB);
        System.out.println("Address: " + address);
    }
}
