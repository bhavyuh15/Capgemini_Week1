import java.util.Scanner;

public class averageMarks {

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.println("Enter Marks of Physics");
		int physics = input.nextInt();
		
		System.out.println("Enter Marks of Chemistry");
		int chemistry = input.nextInt();
		
		System.out.println("Enter Marks of Maths");
		int maths = input.nextInt();
		
		int average = (physics+chemistry+maths)/3;
		
		if(average>=80){
			 System.out.println("your average is " + average + " and your grade is A (Level 4,above agency-normalized standards)");
		}
		else if (average>=70 && average<=79){
			System.out.println("your average is " + average + " and your grade is B (Level 3, at agency-normalized standards)");
		}
		else if(average>=60 && average<=69){
			System.out.println("your average is " + average + " and your grade is C (Level 2,below,but approaching agency-normalized standards)");
		}
		else if (average>=50 && average<=59){
			System.out.println("your average is " + average + " and your grade is D  (Level 1,well  below agency-normalized standards)");
		}
		else if(average>=40 && average<=49){
			System.out.println("your average is " + average + " and your grade is E ( Level 1-, too below agency-normalized standards)");
		}
		else if(average>=39){
			System.out.println("your average is " + average + " (Remedial standards)");
	}
	}
}


			
