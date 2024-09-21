import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> uniqueElements = new HashSet<>();

        // Stream to find duplicate elements
        Set<Integer> duplicateElements = listOfIntegers.stream()
                .filter(i -> !uniqueElements.add(i)) // Try to add; if it returns false, it's a duplicate
                .collect(Collectors.toSet()); // Collect duplicates into a set

        // Print the duplicate elements
        System.out.println("Duplicate elements: " + duplicateElements);
    }
}

/* Output :
Duplicate elements: [333, 222, 111]
 */
