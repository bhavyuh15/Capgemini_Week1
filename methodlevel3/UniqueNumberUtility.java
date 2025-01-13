import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumberUtility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

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

        // Reverse the digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits array: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if arrays are equal
        boolean arraysEqual = areArraysEqual(digits, reversedDigits);
        System.out.println("Are original and reversed arrays equal: " + arraysEqual);

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindromeNumber(digits);
        System.out.println("Is Palindrome Number: " + isPalindrome);

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        scanner.close();
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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindromeNumber(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
