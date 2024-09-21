import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElementsIn2Array {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Convert arrays to sets
        Set<Integer> set1 = Arrays.stream(array1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
        // boxed() method converts the int primitives to Integer objects.

        // Find common elements
        set1.retainAll(set2);

        // Print common elements
        System.out.println("Common elements: " + set1);

        //2nd approach : Using Streams and filter
        System.out.println("Common elements:");
        Arrays.stream(array1)
                // Check if value exists in array2
                .filter(value -> Arrays.stream(array2).anyMatch(v -> v == value))
                .forEach(System.out::println);

        //3rd
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

        // Find and print common elements
        System.out.println("Common elements:");
        list1.stream()
                .filter(list2::contains) // Check if list2 contains the element
                .forEach(System.out::println); // Print the common elements
    }
}
