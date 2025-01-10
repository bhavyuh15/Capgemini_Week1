import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the salary of the employee
        System.out.print("Enter the salary of the employee: ");
        double salary = scanner.nextDouble();
        
        // Ask the user to enter the years of service of the employee
        System.out.print("Enter the years of service: ");
        int yearsOfService = scanner.nextInt();
        
        // Variable to store the bonus
        double bonus = 0;
        
        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            bonus = salary * 0.05;
            System.out.println("The employee is eligible for a bonus.");
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }
        
        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);
    }
}
