import java.util.Scanner;
class chocolates{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of children");
		int numberofchildren=sc.nextInt();
		System.out.println("Enter Number of Chocolates");
		int numberofchocolates=sc.nextInt();
		//calculate distributed chocolates
		int res = numberofchildren/numberofchocolates;
		//calculate remaining chocolates
		int remaining=numberofchildren%numberofchocolates;
	//Desired output
	System.out.println(" The number of chocolates each child gets is " + res + " and the number of remaining chocolates are " + remaining);
	}
}