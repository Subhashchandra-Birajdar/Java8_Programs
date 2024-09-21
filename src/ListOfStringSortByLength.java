import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListOfStringSortByLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        // Sort the strings by their length
        List<String> sortedByLength = listOfStrings.stream()
                .sorted(Comparator.comparingInt(String::length)) // Sort by length
                .toList(); // Collect the results into a List

        // Print the sorted list
        System.out.println("Strings sorted by length:");
        sortedByLength.forEach(System.out::println);
    }
}
/* Output :
Strings sorted by length:
C
C#
C++
Java
HTML
COBOL
Python
Kotlin
 */