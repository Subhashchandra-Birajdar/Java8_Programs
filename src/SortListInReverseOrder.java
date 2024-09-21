import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListInReverseOrder {

    public static void main(String[] args) {
        List<Integer> anyList = Arrays.asList(10, 20, 30, 40, 5, 23, 23, 1, 2, 56, 7, 78, 565, 3, 343, 2);

        // Sort the list in reverse order and print each element
        anyList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println); // Fixed typo here
    }
}

/* Output :
565
343
78
56
40
30
23
23
20
10
7
5
3
2
2
1
*/