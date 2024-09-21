import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(10, 20, 30, 40, 5, 23, 23, 1, 2, 56, 7, 78, 565, 3, 343, 2);

        // Remove duplicate elements and collect them into a new list
        List<Integer> distinctList = listOfIntegers.stream()
                .distinct() // Remove duplicates
                .collect(Collectors.toList()); // Collect to a List

        // Print the distinct elements
        distinctList.forEach(System.out::println);
    }
}

/* Output :
10
20
30
40
5
23
1
2
56
7
78
565
3
343
 */