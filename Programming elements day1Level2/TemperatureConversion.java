import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Celsius:");
        double celsius = input.nextDouble(); // Taking the Celsius temperature as input
        
       
        double fahrenheitResult = (celsius * 9 / 5) + 32;  // Convert the Celsius temperature to Fahrenheit using the formula
        
      
        System.out.println("The " + celsius + " celsius is "+fahrenheitResult+ " fahrenheit");
        
        input.close();
    }
}
