import java.util.Scanner;

public class RocketLaunchFor {

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
            // Start the countdown using a for loop
            for (int i = counter; i >= 1; i--) {
                System.out.println("T-minus " + i + " seconds");
            }
            System.out.println("Liftoff! ");
        }
        
    }
}
