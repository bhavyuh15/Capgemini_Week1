import java.util.ArrayList;
import java.util.Collections;

public class NumberUtility {

    public static void main(String[] args) {
        int number = 153;

        // Count the digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.print("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find the sum of the digits
        int sumOfDigits = sumDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Find the sum of squares of the digits
        int sumOfSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit
        int[][] digitFrequency = findDigitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] freq : digitFrequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1]);
            }
        }
    }

    // Method to count the digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        ArrayList<Integer> digitList = new ArrayList<>();
        while (number > 0) {
            digitList.add(number % 10);
            number /= 10;
        }
        Collections.reverse(digitList);
        return digitList.stream().mapToInt(i -> i).toArray();
    }

    // Method to find the sum of the digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of the digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Digit
        }
        for (int digit : digits) {
            frequency[digit][1]++; // Increment frequency
        }
        return frequency;
    }
}
