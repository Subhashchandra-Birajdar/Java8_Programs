import java.util.stream.Stream;

public class FibonacciStream {
    public static void main(String[] args) {
        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0] + f[1]}) // Generate Fibonacci pairs
                .limit(10) // Limit to the first 10 Fibonacci numbers
                .map(f -> f[0]) // Map to get the first number in the pair
                .forEach(i -> System.out.print(i + " ")); // Print each Fibonacci number
    }
}

/* Output :
0 1 1 2 3 5 8 13 21 34
 */