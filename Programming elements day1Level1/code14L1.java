import java.util.Scanner;
public class code14L1{
	public  static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter feets");
		double feets = input.nextDouble();
		double yards = feets * 0.33;       // finding the distance in yards
		double miles = feets * 0.000189;    // finding the distance in miles
		System.out.println("your distance in feets is " +feets + ", in yards is " + yards + " and in miles is " + miles);
}}
		