import java.util.Scanner;

public class primeNumber{

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.println("Enter a number");
		int number = input.nextInt();
		
		for(int i = 2; i <number;i++){
			if(number%i == 0){
				System.out.println( number + " is not prime ");
				break;
			}
			else{
				System.out.println( number + " is prime ");
				break;
			}		
		}
	}
}	
				