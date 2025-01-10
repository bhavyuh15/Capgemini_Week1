import java.util.Scanner;
public class code13L1{
	public  static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter perimeter");
		int perimeter = input.nextInt();
		int side = perimeter/4 ;          //finding the side of the rectangle
		System.out.println(" The length of the side is " + side + " whose perimeter is " + perimeter);
}}