
public class Bank {
	
	private double balance;
    private double annualInterestRate;

    // le constructor:
    public Bank(double balance, double rate) {
        this.balance = balance;
        this.annualInterestRate = rate;
    }

    // calculateInterest() method:
    public double calculateInterest() {
        return balance * (annualInterestRate / 1200);
    }
    
}
