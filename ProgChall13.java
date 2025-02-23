/**
 * To calculate meal cost and tip rate.
 * @author Dylan Saly
 * @version 1.0v
 * @since 2/22/2025
 */
import java.util.Scanner;
public class ProgChall13 {
    public static void main(String[] args){
        final double TAX_RATE = 0.0675; // 6.75% tax rate
        final double TIP_RATE = 0.20; // 20% tip rate

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter meal amount: $");
        double mealAmount = scanner.nextDouble();

        double tax = mealAmount * TAX_RATE;
        double tip = mealAmount * TIP_RATE;
        double totalCost = mealAmount + tax + tip;

        System.out.println("The tax is: " + String.format("$%,.2f", + tax));
        System.out.println("The tip is: " + String.format("$%,.2f", + tip));
        System.out.println("The meal cost with tax and tip is: " + String.format("$%,.2f", + totalCost));

        scanner.close();
    }
}