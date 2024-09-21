import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumAndMinimumInList {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(10, 20, 30, 40, 5, 23, 1, 2, 56, 7, 78, 565, 3, 343, 2);

        // Find maximum value
        Optional<Integer> max = listOfIntegers.stream()
                .max(Comparator.naturalOrder());

        // Find minimum value
        Optional<Integer> min = listOfIntegers.stream()
                .min(Comparator.naturalOrder());

        // Print the results
        max.ifPresent(maxValue -> System.out.println("Maximum: " + maxValue));
        min.ifPresent(minValue -> System.out.println("Minimum: " + minValue));
    }
}
