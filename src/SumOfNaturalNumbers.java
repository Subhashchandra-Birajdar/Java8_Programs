import java.util.stream.IntStream;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1, 10) // Generates a stream of numbers from 1 to 10
                .sum(); // Sums them up
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}

/* Output :
Sum of first 10 natural numbers: 55
 */