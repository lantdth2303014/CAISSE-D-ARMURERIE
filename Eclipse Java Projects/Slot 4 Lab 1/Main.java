
public class Main {

	public static void main(String[] args) {
		Person person = new Person();
        person.enterInfo();
        person.printInfo();
        
        Person bob = new Person("Bob", "Male", "26/10", "Ha Noi");
        bob.printInfo();
        System.out.println();
        
        Student student = new Student();
        student.enterInfo();
        student.printInfo();
        student.checkScholar();
	}

}
