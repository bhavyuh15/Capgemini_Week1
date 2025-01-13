import java.util.ArrayList;
import java.util.Collections;

public class NumberChecker {

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

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(digits, digitCount);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        // Find largest and second largest digits
        int[] largestTwo = findLargestTwo(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second largest digit: " + largestTwo[1]);

        // Find smallest and second smallest digits
        int[] smallestTwo = findSmallestTwo(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second smallest digit: " + smallestTwo[1]);
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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int digitCount) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digitCount);
        }
        int originalNumber = 0;
        for (int digit : digits) {
            originalNumber = originalNumber * 10 + digit;
        }
        return sum == originalNumber;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestTwo(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestTwo(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
