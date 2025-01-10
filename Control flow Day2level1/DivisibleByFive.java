import java.util.Scanner;

public class DivisibleByFive {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();  // Read the number entered by user
        
        // Check if the number is divisible by 5
        if (num % 5 == 0) {
            // If divisible by 5, print the message
            System.out.println("Is the number " + num + " divisible by 5? Yes");
        } else {
            // If not divisible by 5, print the message
            System.out.println("Is the number " + num + " divisible by 5? No");
        }
    }
}
