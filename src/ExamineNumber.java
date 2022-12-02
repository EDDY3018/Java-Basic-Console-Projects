import java.util.Scanner;
public class ExamineNumber {




    public static void main(String[] args) {

        int negatives = 0;
        double sum = 0.0;

        System.out.println("This program examines a sequence ");
        System.out.println("of numbers to find the average  ");
        System.out.println("and count how many are negatives \n");


        Scanner sc = new Scanner((System.in));
        System.out.println("How many numbers do you have ?");
        int totalNumber = sc.nextInt();

        for ( int i = 1 ; i  <= totalNumber; i++)
        {
            System.out.print("# " + i   +   " ?" );
            double next = sc.nextDouble();
            sum += next;
            if (next < 0) {
                negatives++;

            }
        }
        System.out.println();

        if (totalNumber <= 0 ) {
            System.out.println("No numbers to average");
        } else {
            double average = sum / totalNumber;
            System.out.println("average = " + average);
        }
        System.out.println(" # of negetives  = " + negatives);
    }
}

