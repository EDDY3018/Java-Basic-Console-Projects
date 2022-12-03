//The goal is: after asking the user for two integers,
// it should display ONE message box of the prime numbers and palindromes between those numbers. Such as:
//"Between numbers x and y: (prime numbers here)
//Palindromes: (palindromic prime here)"


import javax.swing.JOptionPane;
public class Loops {
    public static String getPalindromicPrimes(int x, int y) {

        StringBuilder sb = new StringBuilder();
        JOptionPane.showMessageDialog(null, "Between the numbers " + x + " and " + y + ": ");

        for (int i = x; i <= y; i++) {
            int k;
            for (k = 2; k < i; k++) {
                int n = i % k;
                if (n == 0)
                    break;
            }
            if (i == k) {
                sb.append(" " + i + " ");
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {

        String output = getPalindromicPrimes(6, 19);
        JOptionPane.showMessageDialog(null, "Palindromes: " + output, "Prime Numbers and Palindromes", JOptionPane.QUESTION_MESSAGE);

            correct();

           


    }

    public static  void correct(){
        JOptionPane.showMessageDialog(null,"Correct ,Great job");
    }
    public static  void Incorrect(){
        JOptionPane.showMessageDialog(null,"Incorrect ,Try Again");
    }
}
