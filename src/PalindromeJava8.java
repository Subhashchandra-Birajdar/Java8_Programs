import java.util.stream.IntStream;

public class PalindromeJava8 {
    public static void main(String[] args) {
        String str = "ROTATOR";

        // Check if the string is a palindrome
        boolean isItPalindrome = IntStream.range(0, str.length() / 2)
                .noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

        // Output the result
        if (isItPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}

/* Output :
ROTATOR is a palindrome
 */