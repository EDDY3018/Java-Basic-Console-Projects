/*@Edmund_Quainoo
 */

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Color;
       //public class Attendance {
    /**
     */
    public class Attendance extends JFrame {

        public Attendance() {
            getContentPane().setBackground(Color.DARK_GRAY);
            setTitle("Confirm Dialog in Frame");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
            setResizable(false);
            setSize(400, 300);
            getContentPane().setLayout(null);
        }


        public static void main(String[] args) {
            int present;
            int absent;
            int male;
            int female;
            int sum;

            String input;
            String output;
            input = JOptionPane.showInputDialog(null, "Enter student that are Present", JOptionPane.QUESTION_MESSAGE);
            present = Integer.parseInt(input);

            input = JOptionPane.showInputDialog(null, "Enter student tha are Absent:", JOptionPane.QUESTION_MESSAGE);
            absent = Integer.parseInt(input);
            // adding of male and female student;

            input = JOptionPane.showInputDialog(null, "Enter number of Male students:", JOptionPane.QUESTION_MESSAGE);
            male = Integer.parseInt(input);

            input = JOptionPane.showInputDialog(null, "Enter student of Female students:", JOptionPane.QUESTION_MESSAGE);
            female = Integer.parseInt(input);
            sum = male + female;

            output = "Number of student Present:\n" + present + "\nNumber of student Absent:\n" + absent + "\nSum of Male and Female is :" + male + "+"
                    + female + " = " + sum;
            JOptionPane.showMessageDialog(null, output, "Adding the both Male and Female",
                    JOptionPane.INFORMATION_MESSAGE);

            present = JOptionPane.showConfirmDialog(null, " Are you Sure:", String.valueOf(JOptionPane.QUESTION_MESSAGE),
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, output, "CONFIRMATION",
                    JOptionPane.INFORMATION_MESSAGE);
            System.out.println(output);

        }
    }

