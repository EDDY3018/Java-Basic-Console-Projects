//Edmund_Quainoo

import javax.swing.*;

public class VerifyTicketNumber {
    public static void main(String[] args) {
        String ticketNumber;
        ticketNumber = JOptionPane.showInputDialog(null, "Enter six ticket Numbers");
        if (ticketNumber.length()<6 || ticketNumber.length()>6){
            JOptionPane.showMessageDialog(null, "False");

        }else {
            int droppedLastDigit = (Integer.parseInt(ticketNumber) / 10);
            int lastTicketNumber = (Integer.parseInt(ticketNumber) % 7);
            boolean checkValidity = (droppedLastDigit % 7) == lastTicketNumber;

            if (checkValidity) {
                JOptionPane.showMessageDialog(null, "True");
            } else {
                JOptionPane.showMessageDialog(null, "False");
            }

        }
    }
}
