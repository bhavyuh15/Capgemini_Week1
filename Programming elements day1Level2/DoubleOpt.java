import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the three integers a, b, and c
        System.out.println("Enter the value for a");
        double a = input.nextDouble();
        
        System.out.println("Enter the value for b");
        double b = input.nextDouble();
        
        System.out.println("Enter the value for c");
        double c = input.nextDouble();


   
        double result1 = a + b * c;  // Multiplication has higher precedence than addition
      
        double result2 = a * b + c;  // Multiplication has higher precedence than addition
   
        double result3 = c + a / b;  // Division has higher precedence than addition
     
        double result4 = a % b + c;  // Modulus has higher precedence than addition

       
        System.out.println("The results of Int Operations are "+ result1 +", "+ result2+", "+result3+ ", and " + result4);

     
        input.close();
    }
}
