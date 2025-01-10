import java.util.Scanner;
public class code11L1{
public static void main (String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter your first number");	
float no1 = input.nextFloat();
System.out.println("Enter your Second number");
float no2 = input.nextFloat();
 
// performing arithmetic operations for calculator 
  
float addn= no1 + no2;
float subn = no1-no2;
float multin = no1*no2;
float divin = no1/no2;

System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +no1+ " and " + no2 + "is " + addn + "," + subn + "," + multin+ "," + divin);
}
} 