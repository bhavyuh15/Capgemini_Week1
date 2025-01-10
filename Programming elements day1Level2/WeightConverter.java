import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Weight in pounds
        System.out.print("Enter the weight of the person in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Conversion: 1 pound = 0.453592 kg
        double weightInKilograms = weightInPounds * 0.453592;

        // Output
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f.\n",weightInPounds, weightInKilograms);
    } }