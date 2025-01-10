import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total sum to 0.0
        double total = 0.0;
        
        // Create a variable to store the user input
        double number;
        
        // Ask the user for input initially
        System.out.println("Enter numbers to sum (enter 0 to stop): ");
        
        // Start the loop to keep asking the user for input until 0 is entered
        number = scanner.nextDouble(); // Read the first user input
        
        // Use a while loop to continue taking input until the user enters 0
        while (number != 0) {
            // Add the entered number to the total sum
            total += number;
            
            // Ask the user for input again
            number = scanner.nextDouble();
        }
        
        // After exiting the loop, print the total sum
        System.out.println("Total sum: " + total);
        
       
    }
}
