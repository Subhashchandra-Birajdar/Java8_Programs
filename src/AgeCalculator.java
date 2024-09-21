import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {
    public static void main(String[] args) {
        // Specify the birth date
        LocalDate birthDay = LocalDate.of(1985, 1, 23); // Note: January is represented by 1, not 01
        // Get today's date
        LocalDate today = LocalDate.now();

        // Calculate the number of years between the birth date and today
        long years = ChronoUnit.YEARS.between(birthDay, today);

        // Print the result
        System.out.println("Years since birth: " + years);
    }
}
/* Output :
Years since birth: 39
 */