import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        // Finding the second largest number
        Optional<Integer> secondLargestNumber = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the largest number
                .findFirst(); // Get the next one (second largest)

        // Print the result
        if (secondLargestNumber.isPresent()) {
            System.out.println("Second largest number: " + secondLargestNumber.get());
        } else {
            System.out.println("The list does not have enough elements.");
        }
    }
}
/* Output :
Second largest number: 75
 */