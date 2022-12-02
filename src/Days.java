import java.util.Scanner;
public class Days {
    public static void main(String[] args) {
        //Enter the numbers of days as the Array length
        Scanner console = new Scanner(System.in);
        System.out.println("How many days' temperature");
        int days = console.nextInt();

        int [] temps = new int [ days ];// array to store days ' temperature
        int sum =0;

        for (int i = 0; i < days; i++) { // read or store each days ' temperature

            System.out.println("Day " + ( i + 1 )+ " 's high temp");
            temps[ i ] = console.nextInt();
            sum += temps[i];

        }
        double average = (double ) sum / days;

        int count = 0;
        for (int i = 0; i < days; i++ ) {
            if ( temps[i] < average ){
                count++;
            }

        }

        //reports results
        System.out.printf(" Average temp = %.1f\n", average);
        System.out.println(count + "days above average" );
    }

}

