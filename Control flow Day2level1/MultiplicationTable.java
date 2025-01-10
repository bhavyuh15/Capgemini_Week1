import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number to generate the multiplication table: ");
        int number = scanner.nextInt();
        
        // Use a for loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i; // Multiply the number by i
            System.out.println(number + " * " + i + " = " + result); // Print the multiplication result
        }
    }
}
