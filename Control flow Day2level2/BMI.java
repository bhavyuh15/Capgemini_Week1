import java.util.Scanner;

public class BMI{

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.println("Enter height");
		double height = input.nextDouble();
		
        // Ask the user to enter a number
        System.out.println("Enter weight");
		double weight =  input.nextDouble();
		
		double heightInM = height *0.01;
		
		double bmi = weight/(heightInM*heightInM);
		if(bmi<=18.4){
			System.out.println("Underweight");
		}
			else if (bmi <=24.9 && bmi >=18.5){
				System.out.println("normal");
			}
			else if (bmi <=39.9 && bmi >= 25.0){
				System.out.println("overweight");
			}
			else {
				System.out.println("obese");
			}
		}
	}
	