import java.util.Scanner;

public class primeNumber{

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.println("Enter a number");
		int number = input.nextInt();
		
		while (true){
			if(number >=0 && number %3==0 && number %5 ==0){
				 System.out.println("FizzBuzz");
				 break;
			}
			else if(number >=0 && number %3==0){
				System.out.println("Fizz");
				break;
			}
			else if (number >=0 && number %5==0){
				System.out.println("Buzz");
				break;
			}
			else if(number >=0){
				System.out.println(number);
				break;
			}
		}
	}
}