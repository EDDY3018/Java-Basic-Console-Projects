
import java.util.Scanner;

public class Loops {
    public static void main (String[] args ){
        int number = 0;
        int x = 1;
        int compNumber;
        int userNumber;

        Scanner input = new Scanner(System.in);

        //Generate a random number
        compNumber = (int) (Math.random() * 100);
        userNumber = -1;
        while(userNumber != compNumber) {
            System.out.println("Enter or guess a number between 0 and 100:");
            userNumber = input.nextInt();


            if (userNumber == compNumber)
                System.out.println("YES your're right and the number is " + compNumber);

            else if (userNumber > compNumber) {
                System.out.println("Too big or high ");
            } else if (userNumber < compNumber) {
                System.out.println("LOW ! ! ! ");
            }
            System.out.println("YOU REALLY NEED TO BE BRILLIANT ");
        }

    }
}

