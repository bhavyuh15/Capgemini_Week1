import java.util.Scanner;
public class code16L1{
	public  static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of students");
		int numberOfStudents = input.nextInt();
		int possibleHandshakes= (numberOfStudents*(numberOfStudents - 1))/2; // finding the possible Handshakes
		System.out.println(" possible number of handshakes is " +possibleHandshakes);
}}