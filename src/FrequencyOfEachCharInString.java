import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharInString {
    public static void main(String[] args) {
        String str = "subhashchandra";

        Map<Character, Long> collect = str.chars().
                mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        collect.forEach((Character,count)->
                System.out.println(Character+" :"+count));
    }
}
