import java.util.Scanner;

public class FactorialCalculatorFor {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the entered number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Variable to store the factorial result
            long factorial = 1;
            
            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply factorial by i
            }
            
            // Print the factorial result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
      
    }
}
