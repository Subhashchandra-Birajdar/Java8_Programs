import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfTheDigitsOfIntegerUsingJavaStreams {
    public static void main(String[] args) {
        int i = 12345; // Example integer

        // Calculate the sum of digits
        Integer sumOfDigits = Stream.of(String.valueOf(i).split(""))
                                    .collect(Collectors.summingInt(Integer::parseInt));


        /*
        tring.valueOf(i): Converts the integer i to a string.
        .split(""): Splits the string into an array of its constituent characters (digits).
        Stream.of(...): Creates a stream from the array of string digits.
         */
        // Print the result
        System.out.println("Sum of digits: " + sumOfDigits);
    }
}
