import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListOfStringsWithprefixsuffixdelimiter {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("apple", "banana", "cherry");

        // Join the list of strings with a prefix, suffix, and delimiter
        String result = listOfStrings.stream()
                .collect(Collectors.joining(", ", "Prefix: ", " : Suffix"));

        // Print the result
        System.out.println(result);

        /*
            Collectors.joining(", ", "Prefix: ", " : Suffix"):
            Delimiter: ", " (you can choose any string as a delimiter).
            Prefix: "Prefix: " (this will be added at the beginning).
            Suffix: " : Suffix" (this will be added at the end).
         */

    }
}

/* Output :

 */