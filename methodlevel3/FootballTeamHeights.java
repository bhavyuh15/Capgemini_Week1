import java.util.Random;

public class FootballTeamHeights {

    public static void main(String[] args) {
        // Create an array to store the heights of 11 players
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // 101 because upper bound is exclusive
        }

        // Display the generated heights
        System.out.println("Heights of the players (in cm):");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate and display the shortest, tallest, and mean heights
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortestHeight(heights);
        int tallest = findTallestHeight(heights);

        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + String.format("%.2f", mean) + " cm");
    }

    // Method to calculate the sum of all elements in the array
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int sum, int numberOfElements) {
        return (double) sum / numberOfElements;
    }

    // Method to find the shortest height in the array
    public static int findShortestHeight(int[] array) {
        int shortest = array[0];
        for (int num : array) {
            if (num < shortest) {
                shortest = num;
            }
        }
        return shortest;
    }

    // Method to find the tallest height in the array
    public static int findTallestHeight(int[] array) {
        int tallest = array[0];
        for (int num : array) {
            if (num > tallest) {
                tallest = num;
            }
        }
        return tallest;
    }
}
