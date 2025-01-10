import java.util.Scanner;
public class code9L1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter fee amount");
		int fee = input.nextInt();             
		System.out.println("Enter discount");
		int discountPercent =input.nextInt();
		int discount = (fee*10)/100;           //finding discount amount
		int finalPrice=fee-discount;           // finding final amount
		System.out.println("The discount amount is INR " + discount+ " and the final discounted ffee is INR " + finalPrice);
}
}