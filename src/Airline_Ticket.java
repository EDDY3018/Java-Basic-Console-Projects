import java.util.*;
class Airline_Ticket {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ticket number");
        int ticket = scan.nextInt();

        int length = (int)(Math.log10(ticket)+1);

        while(length != 6){
            System.out.println("Number must be 6 digits \n");

            System.out.println("Enter ticket number");
            ticket = scan.nextInt();

            length = (int)(Math.log10(ticket)+1);

        }

        int dropped_last = ticket / 10;
        int last_num = ticket % 10;
        int remainder = dropped_last % 7;

        if(remainder == last_num){
            boolean validity = true;
            System.out.println(validity);
        }
        else {
            boolean validity = false;
            System.out.println(validity);
        }

    }
}
