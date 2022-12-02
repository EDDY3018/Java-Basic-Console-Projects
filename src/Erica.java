import java.util.Scanner;

public class Erica {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

double height = 0;
double weight = 0;
double bmi;

        System.out.println("Enter your height");
        height = input.nextDouble();
        System.out.println("enter your weight");
        weight = input.nextDouble();

        bmi = weight/ (height * height) * 703;
        System.out.println("Current bmi is " + bmi);

    }
}
