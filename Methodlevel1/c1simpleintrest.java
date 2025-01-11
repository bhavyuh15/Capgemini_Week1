import java.util.Scanner;
public class c1simpleintrest{
	
	public void getSimpleIntrest(int principal,int rate,int time){
	int SI = (principal*rate*time)/100;
	System.out.println( " The Simple Interest is " + SI +" with Principal " + principal +  "  ,Rate of Interest " + rate + " and Time " +time);
	}
	
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter principal : ");
		int principal=sc.nextInt();
		System.out.print("Enter rate : ");
		int rate=sc.nextInt();
		System.out.print("Enter time : ");
		int time =sc.nextInt();
		
		c1simpleintrest obj = new c1simpleintrest();
		obj.getSimpleIntrest(principal,rate,time);
}
}
		
		