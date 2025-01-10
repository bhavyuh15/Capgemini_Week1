import java.util.Scanner;

public class TemperatureConversionFnToCel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = input.nextDouble(); // Taking the Fahrenheit temperature as input
        
        double celsiusResult = (fahrenheit - 32) * 5 / 9; // Convert the Fahrenheit temperature to Celsius using the formula
        
        System.out.println("The "+ fahrenheit +" fahrenheit is "+ celsiusResult +" Celsius");
        
        input.close();
    }
}
