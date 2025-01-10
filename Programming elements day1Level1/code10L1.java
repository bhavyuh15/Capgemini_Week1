import java.util.Scanner;
public class code10L1{
	public  static void main(String args[]){
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter your height in cms");
		double centimeters = input.nextDouble();
		double inches = centimeters * 0.3937;    // finding the height in inches
		double feet = centimeters *0.0328;       // finding the height in feet
		System.out.println("Your Height in cm is " +centimeters + "  while in feet is "+feet +" and inches is " + inches );
	}
}