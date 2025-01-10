import java.util.Scanner;

public class SmallestNumberCheck {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        
        // Check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            // If the first number is smaller than both the second and third
            System.out.println("Is the first number the smallest? Yes");
        } else {
            // If the first number is not the smallest
            System.out.println("Is the first number the smallest? No");
        }
    }
}
