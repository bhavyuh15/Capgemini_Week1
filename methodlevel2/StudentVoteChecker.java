
import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if the student can vote
    public boolean canStudentVote(int age) {
        // Validate if the age is a negative number
        if (age < 0) {
            return false;  // Invalid age, cannot vote
        }
        // Check if the age is 18 or above
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        // Define an array to store ages of 10 students
        int[] ages = new int[10];

        // Loop through the array to take input for each student's age
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            
            // Check if the student can vote based on their age
            boolean canVote = checker.canStudentVote(ages[i]);

            // Display the result for the current student
            if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        scanner.close();  // Close the scanner to prevent resource leak
    }
}

