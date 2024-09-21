import java.util.Arrays;
import java.util.List;

public class PrintMultiplesOf5 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(10, 20, 30, 40, 5, 23, 23, 1, 2, 56, 7, 78, 565, 3, 343, 2);

        // Print multiples of 5 from the list
        listOfIntegers.stream()
                .filter(i -> i % 5 == 0) // Filter multiples of 5
                .forEach(System.out::println); // Print each multiple
    }
}

/* output :
10
20
30
40
5
565
 */