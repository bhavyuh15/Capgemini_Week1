import java.util.Scanner;

public class NumberChecker6 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // Find the count of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        // Store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    // Method to find the sum of the factors using the factors array
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double findProductOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // excluding the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // excluding the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = findSumOfFactors(factors) - number; // excluding the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sumOfFactorials = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        return sumOfFactorials == originalNumber;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Finding factors of the number
        int[] factors = findFactors(number);

        // Displaying the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        // Sum of factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

        // Product of factors
        int productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

        // Product of cubes of factors
        double productOfCubes = findProductOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);

        // Checking if the number is perfect, abundant, or deficient
        System.out.println(number + " is a perfect number: " + isPerfectNumber(number));
        System.out.println(number + " is an abundant number: " + isAbundantNumber(number));
        System.out.println(number + " is a deficient number: " + isDeficientNumber(number));

        // Checking if the number is a strong number
        System.out.println(number + " is a strong number: " + isStrongNumber(number));

        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}
