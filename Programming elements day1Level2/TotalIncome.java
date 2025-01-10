import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.println("Enter your salary:");
        double salary = input.nextDouble(); // Taking salary input from the user
        
        System.out.println("Enter your bonus:");
        double bonus = input.nextDouble(); // Taking bonus input from the user
        
        
        double totalIncome = salary + bonus; // Calculating the total income by adding salary and bonus
            
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

        input.close();
    }
}
