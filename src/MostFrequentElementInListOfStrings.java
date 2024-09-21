import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElementInListOfStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        // Count occurrences of each element
        Map<String, Long> elementCountMap = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Find the most frequent element
        Map.Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null); // Use orElse to handle empty case

        // Print the result
        if (mostFrequentElement != null) {
            System.out.println("Most Frequent Element: " + mostFrequentElement.getKey());
            System.out.println("Count: " + mostFrequentElement.getValue());
        } else {
            System.out.println("The list is empty.");
        }
    }
}

/* Output :
Most Frequent Element: Pen
Count: 3
 */