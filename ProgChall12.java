/**
 * this lab was made to output various information about the city
 * @author Dylan Saly
 * @version 1.0v
 * @since
 */
import java.util.Scanner;

public class ProgChall12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a city");
        String city = scanner.nextLine();

        //Output various information
        System.out.println("The city entered has: " + city.length() + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + city.charAt(0));

        scanner.close();
    }
}