import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.println("enter year");
		int year = input.nextInt();
		
		if(year>=1582){
			if(year%400==0){
				System.out.println("The year " + year + " is  a leap year");
			}
			else if(year%100==0){
				System.out.println("The year " + year + " is not a leap year");
			}
			else if(year%4==0){
				System.out.println("The year " + year + " is a leap year");
			}
		}
	}
}