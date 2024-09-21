import java.util.stream.Stream;

public class OddNumbersStream {
    public static void main(String[] args) {
        Stream.iterate(new int[] {1, 3}, f -> new int[] {f[1], f[1] + 2}) // Generate pairs of numbers
                .limit(10) // Limit to the first 10 odd numbers
                .map(f -> f[0]) // Map to get the first element (the odd number)
                .forEach(i -> System.out.print(i + " ")); // Print each odd number
    }
}

/* Output :
1 3 5 7 9 11 13 15 17 19
 */