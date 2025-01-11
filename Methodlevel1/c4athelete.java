import java.util.Scanner;
class c4athelete{
	
	public void rounds(int s1,int s2,int s3){
		int perimeter = s1+s2+s3;
		int round = 5/perimeter;
		 System.out.print("rounds user needs to do to complete 5km run  " + round);
	}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of side 1 : ");
		int s1=sc.nextInt();
          System.out.print("Enter the length of side 2 : ");
		int s2=sc.nextInt();
		  System.out.print("Enter the length of side 3 : ");
		int s3=sc.nextInt();
		
		c4athelete obj = new c4athelete();
		obj.rounds(s1,s2,s3);
	}
}