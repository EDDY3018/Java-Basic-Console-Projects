import java.util.Scanner;

public class interger {

    public static void main (String[] args) {



        int number1;
        int number2;

        number1 = (int) (System.currentTimeMillis() % 100);
        number2 = (int) ((System.currentTimeMillis() * 3) % 100);

        System.out.println("What is " + number1 + " + " + number2 + " ? ");
        Scanner input = new Scanner(System.in);

        int result = input.nextInt();
        if (number1 + number2 == result) {
            System.out.println("Correct " + (number1 + number2 == result));
        } else {
            System.out.println("Incorrect " + (number1 + number2 == result));

        }
        System.out.println("You REALLY need to work on your additions" + (number1 + number2 == result) );
    }
}