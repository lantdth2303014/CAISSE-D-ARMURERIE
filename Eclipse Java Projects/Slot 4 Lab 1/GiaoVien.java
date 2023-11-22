import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GiaoVien extends Person {

    private List<String> classesTaught;
    private double salary;
    private int numberOfSubjectsTaught;
    private List<String> subjectsTaught;

    // le constructor
    public GiaoVien(String name, String gender, String dateOfBirth, String address,
                   			List<String> classesTaught, double salary, int numberOfSubjectsTaught, List<String> subjectsTaught) {
        super(name, gender, dateOfBirth, address);
        this.setClassesTaught(classesTaught);
        this.setSalary(salary);
        this.setNumberOfSubjectsTaught(numberOfSubjectsTaught);
        this.setSubjectsTaught(subjectsTaught);
    }

    // Getters and Setters
    public List<String> getClassesTaught() {
        return classesTaught;
    }

    public void setClassesTaught(List<String> classesTaught) {
        this.classesTaught = classesTaught;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberOfSubjectsTaught() {
        return numberOfSubjectsTaught;
    }

    public void setNumberOfSubjectsTaught(int numberOfSubjectsTaught) {
        this.numberOfSubjectsTaught = numberOfSubjectsTaught;
    }

    public List<String> getSubjectsTaught() {
        return subjectsTaught;
    }

    public void setSubjectsTaught(List<String> subjectsTaught) {
        this.subjectsTaught = subjectsTaught;
    }

    // Enter information method
    @Override
    public void enterInfo() {
        super.enterInfo();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of classes taught: ");
        int numberOfClasses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<String> classesList = new ArrayList<>();
        for (int i = 0; i < numberOfClasses; i++) {
            System.out.print("Enter class " + (i + 1) + ": ");
            classesList.add(scanner.nextLine());
        }
        setClassesTaught(classesList);

        System.out.print("Enter salary: ");
        setSalary(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter number of subjects taught: ");
        setNumberOfSubjectsTaught(scanner.nextInt());
        scanner.nextLine(); // Consume the newline character

        List<String> subjectsList = new ArrayList<>();
        for (int i = 0; i < numberOfSubjectsTaught; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjectsList.add(scanner.nextLine());
        }
        setSubjectsTaught(subjectsList);
    }

    // Print information method
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Classes Taught: " + classesTaught);
        System.out.println("Salary: " + salary);
        System.out.println("Number of Subjects Taught: " + numberOfSubjectsTaught);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }
}