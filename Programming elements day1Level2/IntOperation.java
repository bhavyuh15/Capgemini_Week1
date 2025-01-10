import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the three integers a, b, and c
        System.out.println("Enter the value for a");
        int a = input.nextInt();
        
        System.out.println("Enter the value for b");
        int b = input.nextInt();
        
        System.out.println("Enter the value for c");
        int c = input.nextInt();


   
        int result1 = a + b * c;  // Multiplication has higher precedence than addition
      
        int result2 = a * b + c;  // Multiplication has higher precedence than addition
   
        int result3 = c + a / b;  // Division has higher precedence than addition
     
        int result4 = a % b + c;  // Modulus has higher precedence than addition

        System.out.println("The results of Int Operations are "+ result1 +", "+ result2+", "+result3+ ", and " + result4);

     
        input.close();
    }
}
