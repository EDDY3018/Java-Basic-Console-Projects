import java.util.Scanner;
public class Hello_Mommy {
    public static void main(String[] args) {
        int integer=0;
        // Creates a reader instance which takes
        // input from standard input - keyboard

        Scanner input = new Scanner(System.in);


        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");



        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();
        // println() prints the following line to the output screen
        System.out.println("You entered: " + number);
        integer  = input.nextInt();

        if (integer  != number ){
            System.out.println(" YES ! ! !  This an Integer");
        }

        if (integer == number );
        System.out.println("NO ! ! !  This an Integer");




    }
}

