import javax.swing.JOptionPane;

    public class Ticket {
        public static void main(String[] args) {
            // taking ticket number
            String question = "Please enter your ticker number";
            String ticket = JOptionPane.showInputDialog(null, question);

            //splitting the number
            String removedLastNumber = ticket.substring(0, ticket.length() - 1);
            String onlyLastNumber = ticket.substring(ticket.length() - 1);

            //converting the number from String to int
            int convertedNumber = Integer.parseInt(removedLastNumber);
            int lastNumber = Integer.parseInt(onlyLastNumber);

            //find the dividend of the convertedNumber
            int dividend = convertedNumber % 7;

            //comparing the number
            boolean compare = lastNumber == dividend;

            //displaying number
            JOptionPane.showMessageDialog(null, compare);

        }
    }

