import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.println("Enter the first number:");
        int number1 = input.nextInt(); // Taking the first number input from the user
        
        System.out.println("Enter the second number:");
        int number2 = input.nextInt(); // Taking the second number input from the user
        
        // Swapping the two numbers using a temporary variable
        int temp = number1;  // Store the value of number1 in a temporary variable
        number1 = number2;   // Assign the value of number2 to number1
        number2 = temp;      // Assign the value of the temporary variable (original number1) to number2
         
        System.out.println("The swapped numbers are " +number1 + " and "+ number2);
        
        input.close();
    }
}
