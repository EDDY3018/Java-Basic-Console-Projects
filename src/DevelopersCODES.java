import javax.swing.JOptionPane;
public class DevelopersCODES {
    public static void main(String[] args) {

        int output ;
        String input = null;


        JOptionPane.showMessageDialog(null, input, "HELLO WORLD PROGRAMMERS ! ! !", JOptionPane.INFORMATION_MESSAGE);


        output = JOptionPane.showConfirmDialog(null, " Do you code EVERYDAY ? ", String.valueOf(JOptionPane.QUESTION_MESSAGE),
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, output, "CONFIRMATION",
                JOptionPane.INFORMATION_MESSAGE);
        System.out.println(output);

        

    }
}
