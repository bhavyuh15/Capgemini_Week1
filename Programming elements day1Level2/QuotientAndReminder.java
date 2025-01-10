import java.util.Scanner;

public class QuotientAndReminder{
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number1");
		double number1 = input.nextDouble(); //taking number1 from user as input
		
		System.out.println("Enter number2");
		double number2 = input.nextDouble(); //taking number2 from user as input
		
		double quotient = number1/number2; //calculating quotient
		double reminder = number1/number2; // calculating reminder
		
		System.out.print("The Quotient is "+ quotient + " and Reminder is "+ reminder+" of two number "+ number1 +" and "+number2);
		
		
		input.close();
	}
}