import java.util.Scanner;

public class Trial {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double Area; // of a Square
            double Perimeter;
            double p = 3.142; // constant
            double radius = 15;

            System.out.println("Enter your area:");
            Area = input.nextInt();
            System.out.println("Enter your Perimeter:" + (2*p*Area));
        }
    }


