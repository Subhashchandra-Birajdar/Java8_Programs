import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "Hello World from Java";

        // Reverse each word in the string
        String reversedWords = Arrays.stream(input.split(" ")) // Split the string into words
                .map(word -> new StringBuilder(word).reverse().toString()) // Reverse each word
                .collect(Collectors.joining(" ")); // Join the reversed words back into a single string

        // Print the result
        System.out.println("Reversed words: " + reversedWords);
    }
}

/* Output ;
Reversed words: olleH dlroW morf avaJ
 */