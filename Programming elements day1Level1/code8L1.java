import java.util.Scanner;
public class code8L1{
	public static void main(String args []){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Kilometers");
		double km = input.nextDouble(); // taking input from user
		double mile = km *0.621;      // converting input into miles
		System.out.println("The total miles is " + mile + " mile for the given " + km + "km"); 
}
}