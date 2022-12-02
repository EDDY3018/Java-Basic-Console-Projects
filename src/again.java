import java.util.Scanner;
public class again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] Bmi = new double[2];
        String[] WeightClass = new String[2];

        System.out.println("\"This program reads data for two individual and computes their body mass index (BMI)\\n\"");

        for (int i = 0; i < 2; ++i) {
            System.out.println("Enter persons information");
            System.out.println("Enter height (in inches )");
            double height = sc.nextDouble();

            System.out.println("Enter persons information");
            System.out.println("Enter height (in pounds  )");
            double Weight = sc.nextDouble();
            System.out.println();


            double bmi = Weight / (height * height) * 703;
            Bmi[i] = bmi;


            if (bmi < 18.5){ WeightClass [i] = "Underweight";}
            else if (bmi >= 18.5 && bmi <= 24.5) {WeightClass [i] = " Normal";}
            else if (bmi >= 25.9 && bmi <= 29.9) {WeightClass [i] = " Overweight";}
            else if (bmi >= 30 ) {WeightClass [i] = "Obese";}

        }
        System.out.println("Individual 1 Bmi " +  Bmi [0] + "\n" + WeightClass [0] );
        System.out.println("Individual 2 Bmi " +  Bmi [1] + "\n" + WeightClass [1] );

    }
}
