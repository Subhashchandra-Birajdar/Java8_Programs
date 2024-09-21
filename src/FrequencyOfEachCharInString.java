import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInString {
    public static void main(String[] args) {
        String str = "subhashchandra";

        Map<Character, Long> collect = str.chars().
                mapToObj(c ->(char) c) // Convert int to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

      // Function.identity() is useful when you want to group or process elements
        // without any transformation, as it allows you to use the elements themselves as keys or values.
        collect.forEach((Character,count)->
                System.out.println(Character+" :"+count));
    }
}
