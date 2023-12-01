import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static Student[] students = new Student[10]; 
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        
        // do-while loop to make sure the menu always shows up until the user manually exits the program
        do {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. Sort student by name");
            System.out.println("6. Show students");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editStudentById();
                    break;
                case 3:
                    deleteStudentById();
                    break;
                case 4:
                    sortStudentsByGpa();
                    break;
                case 5:
                    sortStudentsByName();
                    break;
                case 6:
                    showStudents();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 0 and 6.");
                    break;
            }
        } while (choice != 0);
    }
    
    // add student method:
    private static void addStudent() {
        if (studentCount < students.length) {   // Check if the "students" array has a spare slot
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student date of birth: ");
            String dateOfBirth = scanner.nextLine();

            System.out.print("Enter student address: ");
            String address = scanner.nextLine();

            System.out.print("Enter student GPA: ");
            double gpa = scanner.nextDouble();

            students[studentCount++] = new Student(id, name, dateOfBirth, address, gpa);  // Increments the value of studentCount after its current value has been used. Therefore, it effectively indicates the index where the new Student object should be stored in the array
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Cannot add more students. Array is full.");
        }
    }

    private static void editStudentById() {
        System.out.print("Enter student ID to edit: ");
        int idToEdit = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        boolean found = false;  // false as default
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == idToEdit) {
                System.out.print("Enter new student name: ");
                students[i] = new Student(
                        students[i].getId(),
                        scanner.nextLine(),  // Input the new name
                        students[i].getDateOfBirth(),
                        students[i].getAddress(),
                        students[i].getGpa()
                );

                System.out.println("Student information updated successfully!");
                found = true;  // true if info updated successfully
                break;
            }
        }

        if (!found) {  // if found == false
            System.out.println("Student with ID " + idToEdit + " not found.");
        }
    }

    private static void deleteStudentById() {
        System.out.print("Enter student ID to delete: ");
        int idToDelete = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == idToDelete) {
                // TLDR: start at the "idToDelete" then makes everything to the right of "idToDelete" shift to the left (by overriding)
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount--;
                found = true;
                System.out.println("Student with ID " + idToDelete + " deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + idToDelete + " not found.");
        }
    }

    private static void sortStudentsByGpa() {
        Arrays.sort(students, 0, studentCount, Comparator.comparingDouble(Student::getGpa));
        System.out.println("Students sorted by GPA.");
    }

    private static void sortStudentsByName() {
        Arrays.sort(students, 0, studentCount, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name.");
    }

    private static void showStudents() {
        System.out.println("\nList of Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }
}
