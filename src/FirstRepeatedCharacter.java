import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        // Create a character count map
        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Find the first repeated character
        String firstRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1) // Check for count greater than 1
                .map(Map.Entry::getKey) // Get the character
                .findFirst() // Get the first match
                .orElse("No repeated character"); // Handle case with no duplicates

        // Print the result
        System.out.println("First repeated character: " + firstRepeatedChar);
    }
}

/* output :
First repeated character: a
 */
