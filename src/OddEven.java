import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEven {
    public static void main(String[] args) {
        //int[] listofintegers = {10,20,30,40,5,23,23,1,2,1,2,56,7,78,565,3,343,2};
        //listofintegers.stream(listofintegers).collect(Collectors.partitioningBy(i->i%2==0));
        int[] listOfIntegers = {10, 20, 30, 40, 5, 23, 23, 1, 2, 1, 2, 56, 7, 78, 565, 3, 343, 2};

        // Partitioning the array into even and odd integers
        Map<Boolean, List<Integer>> partitioned = Arrays.stream(listOfIntegers)
                                                          .boxed() // Convert int to Integer
                                                          .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        // Print the results
        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));
    }
}
