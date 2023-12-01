import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        	
            // Input the date in the format yy-mm-dd from the user
            System.out.print("Enter the date (yyyy-mm-dd): ");
            String inputDate = scanner.nextLine();

            // Convert the date string to a LocalDate object
            LocalDate date = parseInputDate(inputDate);

            // Check if the year is a leap year
            boolean isLeapYear = isLeapYear(date.getYear());

            // Print the result
            if (isLeapYear) {
                System.out.println(date.getYear() + " is a leap year.");
            } 
            else {
                System.out.println(date.getYear() + " is not a leap year.");
            } 
            
        } 
        
        catch (DateTimeException e) {
            System.out.println("Invalid date format. Please enter a valid date in the format yy-mm-dd.");
        }
        
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap years are divisible by 4 but not divisible by 100 unless divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to parse the input date string into a LocalDate object
    public static LocalDate parseInputDate(String inputDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(inputDate, formatter);
    }
}