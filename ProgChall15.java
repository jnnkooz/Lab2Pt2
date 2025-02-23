/**
 * The purpose of this lab is to print out the cost per shares
 * @author Dylan Saly
 * @version 1.0v
 * @since 2/22/2025
 */
import javax.swing.JOptionPane;

public class ProgChall15 {
    public static void main(String[] args) {
        final double COMMISSION_RATE = 0.02; // 2% commission rate
        
        // Get input from user using JOptionPane
        String pricePerShareStr = JOptionPane.showInputDialog("Enter the price per share:");
        String numberOfSharesStr = JOptionPane.showInputDialog("Enter the number of shares purchased:");
        
        // Convert input strings to double and int
        double pricePerShare = Double.parseDouble(pricePerShareStr);
        int numberOfShares = Integer.parseInt(numberOfSharesStr);
        
        double totalCostShares = pricePerShare * numberOfShares;
        double commission = totalCostShares * COMMISSION_RATE;
        double totalPaid = totalCostShares + commission;
        
        // Display the output in a single dialog box
        String outputMessage = "Commission: " + String.format("$%,.2f", commission)+"\n" +
        "Total paid (stock + commission): " + String.format("$%,.2f", totalPaid);
        JOptionPane.showMessageDialog(null, outputMessage);
        
        //Close the application
        System.exit(0);
    }
}