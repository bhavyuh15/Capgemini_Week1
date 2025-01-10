import java.util.Scanner;
class SimpleInterest{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal");
		int principal=sc.nextInt();
		System.out.println("Enter Rate");
		int rate=sc.nextInt();
		System.out.println("Enter Time");
		int time=sc.nextInt();
		//calculate simple interest
		int si=(principal*rate*time)/100;
		//desired output
		System.out.println("The Simple Interest is " + si + " for Principal " + principal + " Rate of Interest" + rate + " and Time " + time);
	}
}