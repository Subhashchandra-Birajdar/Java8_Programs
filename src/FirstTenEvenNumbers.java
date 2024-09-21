import java.util.stream.IntStream;

public class FirstTenEvenNumbers {
    public static void main(String[] args) {
        System.out.println("First 10 even numbers:");
        IntStream.range(0, 10) // Generate numbers from 0 to 9
                .map(i -> i * 2) // Multiply by 2 to get even numbers
                .forEach(System.out::println); // Print each even number
    }
}
