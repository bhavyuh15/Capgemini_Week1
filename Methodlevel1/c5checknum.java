import java.util.Scanner;
class c5checknum{
	public int check(int number){
		if(number <0){
			return -1;
		}
		else if(number>0){
			return 1;
		}
		return 0;
	}
 public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number=sc.nextInt();
        c5checknum obj = new c5checknum();
		int a = obj.check(number);          // to store the given number 
		System.out.print(a);
	}
	}