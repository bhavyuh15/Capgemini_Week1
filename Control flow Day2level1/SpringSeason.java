import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        // Create a scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        
        // Check if the date is within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || // March 20 or later
            (month == 4) ||              // Any day in April
            (month == 5) ||              // Any day in May
            (month == 6 && day <= 20)) {  // June 20 or earlier
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        
        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
