import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();
        
        // Check if the entered number is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Iterate from 1 to the number entered by the user
            for (int i = 1; i <= number; i++) {
                // Check if the current number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is even.");
                } else {
                    System.out.println(i + " is odd.");
                }
            }
        }
        
      
    }
}
