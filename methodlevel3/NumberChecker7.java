import java.util.HashSet;

public class NumberChecker7 {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random 6-digit number (between 100000 and 999999)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Use a HashSet to store OTPs and check uniqueness
        HashSet<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        // If the size of the HashSet is equal to the length of the OTP array, all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        // Create an array to save the OTP numbers generated 10 times
        int[] otps = new int[10];

        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check if all OTP numbers are unique
        boolean areUnique = areOTPsUnique(otps);
        if (areUnique) {
            System.out.println("\nAll OTP numbers are unique.");
        } else {
            System.out.println("\nThere are duplicate OTP numbers.");
        }
    }
}
