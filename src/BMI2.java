import java.util.Scanner;
public class BMI2 {
    //Computes Body Mass Index (BMI) for two specific people.
    public static void main(String[] args) {
        //declare variables
        double height;
        double weight;
        double bmi;
        Scanner sc = new Scanner(System.in);
        //compute BMI
        System.out.println("Enter Person's Information:");
        System.out.print("height ( in inches) ? ");
        height = sc.nextDouble();
        System.out.print("Weight ( in pounds) ? ");
        weight = sc.nextDouble();
        bmi = weight / (height * height) * 703;
        System.out.println("Enter Person's Information:");
        System.out.print("height ( in inches) ? ");
        height = sc.nextDouble();
        System.out.print("Weight ( in pounds) ? ");
        weight = sc.nextDouble();
        //print results
        System.out.print("Individual 1 BMI = " );
        System.out.println(bmi);
        System.out.println("Overweight");
        //recompute BMI
        bmi = weight / (height * height) * 703;
        //report new results
        System.out.print("Individual 2 BMI = " );
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 - 24.9) {
                System.out.println("Normal");
            } else if (bmi >= 25.9 - 29.9) {
                System.out.println("Overweight");
            } else if (bmi >= 30){
                System.out.println("Obese");
            }
        }
    }



