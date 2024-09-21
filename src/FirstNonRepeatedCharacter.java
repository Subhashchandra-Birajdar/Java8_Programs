import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        // Create a character count map
        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Find the first non-repeated character
        String firstNonRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1) // Check for count equal to 1
                .map(Map.Entry::getKey) // Get the character
                .findFirst() // Get the first match
                .orElse("No non-repeated character"); // Handle case with no non-repeats

        // Print the result
        System.out.println("First non-repeated character: " + firstNonRepeatedChar);
    }
}
/* Output :
First non-repeated character: j
 */