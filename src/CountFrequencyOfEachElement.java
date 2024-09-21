import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfEachElement {
    public static void main(String[] args) {
        List<Integer> anyList = Arrays.asList(10, 20, 30, 40, 5, 20, 10, 1, 2, 56, 7, 78, 10, 3, 20, 2);

        // Count the frequency of each element in the list
        Map<Integer, Long> frequencyMap = anyList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Function.identity() is useful when you want to group or process elements
        // without any transformation, as it allows you to use the elements themselves as keys or values.

        // Print the frequency of each element
        frequencyMap.forEach((element, count) ->
                System.out.println(element + " : " + count));
    }
}

/* Output :
1 : 1
2 : 2
3 : 1
20 : 3
5 : 1
7 : 1
56 : 1
40 : 1
10 : 3
78 : 1
30 : 1
 */