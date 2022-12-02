import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("This program reads data for two individual and computes their body mass index (BMI)\n");

        double[] BMI = new double[2];
        String[] WeightClass = new String[2];

        for (int i = 0; i < 2; ++i) {
            System.out.println("Enter next person's information:");
            System.out.print("height (in inches)? ");
            double height = UserInput.nextDouble();

            System.out.print("weight (in pound)? ");
            double weight = UserInput.nextDouble();
            System.out.println();

            double bmi = (weight / (height * height)) * 703;
            BMI[i] = bmi;

            if (bmi < 18.5) { WeightClass[i] = "Underweight"; }
            else if (bmi >= 18.5 && bmi <= 24.9) { WeightClass[i] = "Normal"; }
            else if (bmi >= 25.0 && bmi <= 29.9) { WeightClass[i] = "Overweight"; }
            else if (bmi >= 30) { WeightClass[i] = "Obese"; }
        }

        System.out.println("Individual 1 BMI = " + BMI[0] + "\n" + WeightClass[0]);
        System.out.println("Individual 1 BMI = " + BMI[1] + "\n" + WeightClass[1]);
    }
}