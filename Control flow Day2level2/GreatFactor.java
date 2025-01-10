import java.util.Scanner;
class GreatFactor{
	public static void main(String[]args){
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//input user
		System.out.println("Enter Number ");
		int num=sc.nextInt();
		int greatfactor =1;
		for(int i=1;i<num;i++){
			if(num%i==0){
				greatfactor=i;
			}
		}
			System.out.println(greatfactor);
		}
}