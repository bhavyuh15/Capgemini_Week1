import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for their age
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        
        // Check if the person is 18 or older
        if (age >= 18) {
            // If the person is 18 or older, they can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If the person is younger than 18, they cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
