import java.util.Scanner;
public class ReadSetIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        if ( number % 2 == 0 );
        {
            evenSum += number;
        }

        {
            oddSum = oddSum + number;
    }
        System.out.print("Do you want to continue y/n ? ");
        choice = sc.next().charAt(0);

        System.out.println("Sum of even numbers " + evenSum);
        System.out.println("Sum of odd numbers " + evenSum);


    }
}
