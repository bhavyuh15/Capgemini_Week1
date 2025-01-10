import java.util.Scanner;
public class code15L1{
	public  static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter price of the unit");
		int unitPrice = input.nextInt();
		System.out.println("enter quantity");
		int quantity = input.nextInt();
		 int totalPrice = unitPrice * quantity;   // finding the total Price
		 System.out.println(" The total purchase price is INR " + totalPrice + " if the quantity "+ quantity + "and unit price is INR " + unitPrice);
}}