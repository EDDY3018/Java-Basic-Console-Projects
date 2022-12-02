import java.util.Scanner;
public class NewExamine {
    public static void main(String[] args) {

        System.out.println("This examines a sequence ");
        System.out.println("of numbers to find average");
        System.out.println("and count how many are negative \n ");

        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        double negetives =  0.0;
        System.out.println("How many numbers do you haave: ");
        int totalnumber = sc.nextInt();

        int i;
        for (i = 1; i <= totalnumber; i++) {
        System.out.println(" # " + i + " ? ");
        double next = sc.nextDouble();
        sum += next;
        if (next < 0) {
            negetives++;

        }
            System.out.println();
        }
            if (totalnumber <= 0) {
                System.out.println("No numbers to average ");


        }else {
            double average = sum / totalnumber;
            System.out.println(" average = " + average);
        }
        System.out.println("# of negatives = " + negetives);
    }



}

