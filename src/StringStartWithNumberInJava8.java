import java.util.Arrays;
import java.util.List;

public class StringStartWithNumberInJava8 {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        listOfStrings.stream()
                    .filter(str -> Character.isDigit(str.charAt(0))) // Check if the first character is a digit
                    .forEach(System.out::println); // Print the matching strings
    }
}

/* Output :
2wo
3hree
5ive
 */
