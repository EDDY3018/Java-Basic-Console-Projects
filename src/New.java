import java.util.Scanner;

public class New {
    /* Prints a Receipt for Goodwill Pharmacy. */
    /* Instance Variables */

    String quantity;

    /* Program Description. */
    public static void main(String[] args) {

        String Cash;
        String quantity;
        float Bill_Total;
        String unit_price;
        /* Cash*/

        System.out.println("Goodwill Pharmacy");
        System.out.println("Lovebarbara1957@gmail.com");
        System.out.println("Closer to the Goil filling Station");
        System.out.println("0246650317,0543275585,054594925");



        Scanner input = new Scanner(System.in);

        System.out.println(" Item(s) : ");
        String items = input.nextLine();
        System.out.println("Price: Gh");
        unit_price = input.nextLine();
        System.out.println("Quantities : ");
        quantity = input.nextLine();
        System.out.println("Discount : 10%");
        System.out.println("Balance:");
        System.out.println(" ====================================================: ");


        System.out.println("BILL TOTAL; Gh " );
        System.out.println("TAX RATE: 0.00");
        System.out.println("VAT: Gh 0.00");
        System.out.println("Net Value: " + unit_price);
        System.out.println("Cash : Gh");
        Cash=input.nextLine();
        System.out.println(" ====================================================: ");

        System.out.println("Please check Goods , receipt & Cash");
        System.out.println("GOODS SOLD OUT ARE NOT REFUNDABLE");

        System.out.println("=====================================================");
    }
}
