import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

    public class groupPROGECT {
        private static Object Date;

        public static void main(String[] args) {
            boolean item = true;
            int receiptLimit = 100;
            double total;
            int quantity;
            float uPrice;
            double taxRate;
            double BALANCE;
            double VAT;

            // double subTotal =  quantity * uPrice;
            Scanner input = new Scanner(System.in);

            for (int i = 98; i < receiptLimit; i++) {
                if (item) {
                    System.out.print("item(s) name: ");
                    String itemsName = input.next();

                    System.out.print("unit price: Gh " );
                    uPrice = input.nextFloat();

                    System.out.print("quantity: Pcs ");
                    quantity = input.nextInt();
                    System.out.print("--- --- --- --- ---   ");

                    double subTotal = quantity * uPrice;
                    System.out.println("Sub total: " + subTotal);

                }
            }

            System.out.println("Tax rate: "+ 0.00 );

            System.out.println("VAT: "+ (0.00) );


            System.out.print("Cash paid:Gh ");
            double cashPaid = input.nextInt();

            //BALANCE= cashPaid - supTotal;
            //System.out.println("Balance : Gh " + BALANCE + 00);
            //System.out.println("=============================================================");

            //      Double balance = cashPaid -(subTotal + taxRate);
            //     System.out.println("Balance: "+ balance);
            Date now = new Date();
            Date currentDate = new Date();
            //String dateToStr= DateFormat.getInstance().format(currentDate);
            System.out.println("Date: "+ Date);

            System.out.println("Please check Goods , receipt & Cash Before you Leave !!!");
            System.out.println("GOODS SOLD OUT ARE NOT REFUNDABLE");

            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        }
    }



