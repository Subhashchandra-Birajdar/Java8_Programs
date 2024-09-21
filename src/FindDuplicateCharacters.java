import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        Set<String> uniqueChars = new HashSet<>();

        // Stream to find duplicate characters
        Set<String> duplicateChars =
                Arrays.stream(inputString.split("")) // Split the string into characters
                        .filter(ch -> !uniqueChars.add(ch)) // Add to set; filter out duplicates
                        .collect(Collectors.toSet()); // Collect duplicates into a set

        // Print the duplicate characters
        System.out.println("Duplicate characters: " + duplicateChars);
    }
}

/* Output :
Duplicate characters: [a, c, t, e, o]
 */