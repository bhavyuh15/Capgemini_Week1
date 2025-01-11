import java.util.Scanner;

public class c7naturalnum{
	public void check(int number){
     int sum = (number*(number+1))/2;
	 System.out.println(sum);
	}

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int number = input.nextInt();
		c7naturalnum obj = new c7naturalnum();
		obj.check(number);
	}
}