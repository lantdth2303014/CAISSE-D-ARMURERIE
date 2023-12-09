import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: $");
        double balance = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (%): ");
        double interestRate = scanner.nextDouble();
        
        
        Bank userAccount = new Bank(balance, interestRate);

        double monthlyInterest = userAccount.calculateInterest();
        System.out.println("Monthly Interest: $" + monthlyInterest);

        scanner.close();

	}

}
