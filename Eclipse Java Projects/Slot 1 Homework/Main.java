
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        int closestPrime = findClosestPrime(x);

        displayResult(x, closestPrime);

        scanner.close();
    }

    public static int findClosestPrime(int x) {
        if (x < 2) {
            // There is no prime number for x less than 2
            return -1;
        }

        // Handle special case for x equals 2
        if (x == 2) {
            return 2;
        }

        // Start searching for prime numbers in reverse order
        for (int i = x - 1; i >= 2; i--) {
            if (isPrime(i)) {
                return i; // Found the closest prime
            }
        }

        return -1; // No prime number found
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {         // i <= Math.sqrt(n) is for optimization
            if (n % i == 0) {
                return false; // Not a prime number
            }
        }
        return true; // It's a prime number
    }

    public static void displayResult(int x, int closestPrime) {
        if (closestPrime != -1) {
            System.out.println("The closest prime number to " + x + " is: " + closestPrime);
        } else {
            System.out.println("No prime number found. Please enter a larger integer.");
        }
    }
}