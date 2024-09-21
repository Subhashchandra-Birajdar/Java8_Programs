import java.util.Arrays;

public class FindSumAndAverage {
    public static void main(String[] args) {

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        // Calculate sum
        int sum = Arrays.stream(a).sum();
        // Calculate average
        double average = Arrays.stream(a).average().orElse(0.0); // Handle case for empty array

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

/* Output :
Sum: 347
Average: 43.375
 */