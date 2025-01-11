public class c12TrigonometricCalculator {

    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert the angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate trigonometric values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return results as an array
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        TrigonometricCalculator calculator = new TrigonometricCalculator();
        
        // Example: Calculate for a given angle
        double angle = 45.0; // You can change this value to test other angles
        double[] results = calculator.calculateTrigonometricFunctions(angle);
        
        // Display the results
        System.out.printf("Angle: %.2f degrees%n", angle);
        System.out.printf("Sine: %.4f%n", results[0]);
        System.out.printf("Cosine: %.4f%n", results[1]);
        System.out.printf("Tangent: %.4f%n", results[2]);
    }
}
