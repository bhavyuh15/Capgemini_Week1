import java.util.Scanner;

public class RocketLaunch {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the starting number for the countdown
        System.out.print("Enter the countdown starting number: ");
        int counter = scanner.nextInt();
        
        // Check if the counter value is greater than or equal to 1
        if (counter < 1) {
            System.out.println("Please enter a positive number greater than or equal to 1.");
        } else {
            // Start the countdown using a while loop
            while (counter >= 1) {
                System.out.println("T-minus " + counter + " seconds");
                counter--;  // Decrement the counter after printing
            }
            System.out.println("Liftoff! ");
        }
    }
}
