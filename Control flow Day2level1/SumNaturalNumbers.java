import java.util.Scanner;

public class SumNaturalNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a natural number
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        // Check if the entered number is a natural number (positive integer)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute the sum using the while loop
            int sumUsingWhile = 0;
            int i = 1;
            while (i <= n) {
                sumUsingWhile += i;
                i++;
            }
            
            // Compute the sum using the formula n * (n + 1) / 2
            int sumUsingFormula = n * (n + 1) / 2;
            
            // Print both results
            System.out.println("Sum using while loop: " + sumUsingWhile);
            System.out.println("Sum using formula: " + sumUsingFormula);
            
            // Compare the two results and print the outcome
            if (sumUsingWhile == sumUsingFormula) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("There is an error in the computations.");
            }
        }
        
        
    }
}
