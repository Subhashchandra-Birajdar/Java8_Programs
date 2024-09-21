import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramStringPrograminJava8 {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        // Normalize and sort the characters of each string
        String normalizedS1 = Stream.of(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        String normalizedS2 = Stream.of(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        // .collect(Collectors.joining()): Joins the sorted characters back into a single string.


        // Check if the normalized strings are equal
        if (normalizedS1.equals(normalizedS2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}


/* Output :
Listen and Silent are anagrams.
 */