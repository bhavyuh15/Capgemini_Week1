
import java.util.Scanner;

public class FactorOperations {

    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop: find the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Finding factors
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculating and displaying the sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // Calculating and displaying the product of factors
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // Calculating and displaying the sum of squares of factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
}

