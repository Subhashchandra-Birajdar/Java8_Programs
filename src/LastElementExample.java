import java.util.Arrays;
import java.util.List;

public class LastElementExample {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        // Get the last element from the list using streams
        String lastElement = listOfStrings.stream()
                .skip(listOfStrings.size() - 1) // Skip all but the last element
                .findFirst() // Find the first element in the remaining stream
                .get(); // Get the value from the Optional

        // Print the last element
        System.out.println("Last element: " + lastElement);
    }
}

/* Output :
Last element: Six
 */