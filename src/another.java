
//GROUP 12
// EDMUND QUAINOO-01200031D
//ODAME HORTHMAN - 01203659D
//OCHERE ROBERT - 01201446D
//ANTWI BBLESSED -01200329D
// ASAMOUAH NHRUMAH RICHMOND-01203874D
// DOMINIC EMMANUEL ABALO - 01200139D
// ANKAH BERNARD ASIAMAH - 01202159D

// This Program is to Generate a receipt for the MEDICATION sold at GOODWILL PHARMACY. //

import java.text.DateFormat;
import java.util.Scanner;//This a simple text scanner which can parse primitive types and strings using regular expressions.
import java.lang.String;//A general class of objects to represent character Strings.
import java.util.Date;// This Provides constructions and methods to deal with date and time in JAVA //
import java.util.Arrays;// This provides static methods to dynamically create and access Java arrays.

    public class another { // This declares the name of the class along with other attributes such as class's superclass .
        public static void main(String[] args) { //This method is the entry point of any java program.


            Scanner input =new Scanner(System.in);// Creates a new Scanner object,that is connected to standard input (the keyboard.)

            System.out.print("Item(s) name: ");
            String items = input.nextLine();//The nextLine() method of the java. util. Scanner class scans from the current position until it finds a line separator delimiter.

            System.out.print("Quantity: Pcs ");
            float item_Quantity = input.nextInt();//The nextInt() method Scans the next token of the input as an Int.

            System.out.print("unit price: ");
            double  unit_price = input.nextDouble();//The nextDouble() method Scans the next token of the input as an Double.

            System.out.print("V.A.T: " );
            float vat = input.nextFloat();

            System.out.print("Tax Rate: ");
            float tax_rate  = input.nextFloat();//The nextFloat() method Scans the next token of the input as an Float.

            //double discount = (discount/100) * unit_price;
            System.out.print("Discount: ");
            float  discount = input.nextFloat();

            //double discount = (discount/100) * unit_price;

            System.out.print("Net Amount : ");
            float    net_value= input.nextFloat();

            System.out.print("Amount paid: ");
            float  cash_paid = input.nextFloat();

            double  t_amount= (item_Quantity * unit_price)+vat+(discount/100)+tax_rate+net_value;
            double balance = cash_paid-t_amount;



            float  Bill_Total = (float) (unit_price * item_Quantity);
            System.out.println("Total : " + Bill_Total + 00);
            float    Bill_total = input.nextFloat();

            //Output receipt
            System.out.println("\t\t\t\t\t\tGoodwill Pharmacy");
            System.out.println("\t\t\t\t\t\tEmail : Lovebarbara1957@gmail.com");
            System.out.println("\t\t\t\t\t\tCloser to the Goil filling Station.Bishop Herman Road ");
            System.out.println("\t\t\t\t\t\tContact : 0246650317,0543275585,054594925" + "\n");

            System.out.println("\t\t\t\t\t\t\t\t\t\ttOriginal Receipt");
            System.out.println("=========================================================================================");
            for (String i : Arrays.asList ("Item Name     " + " Quantity " + "  " + //Arrays class is used to return a fixed-size list backed by the specified array.
                    "   Total", "................................................", items +
                    "             " + item_Quantity + "      ", "................................................", "Vat  " +
                    "                       " + vat, "Tax rate   " + "                 " + tax_rate, "Net Value  " +
                    "                 " + net_value, "Discount " + "                   " + discount + "%", "Item Price " +
                    "                 " + unit_price,"Total Cost" + "                  " + t_amount,"Amount Paid" +
                    "                 " + cash_paid, "..............................................", "Balance" +
                    "      " + "           " + "GH:" + balance)) {
                System.out.println(i);}

            Date currentDate = new Date();//It is used to get a Date for the current time .
            String dateToStr = DateFormat.getInstance().format(currentDate);
            System.out.println("Date: " + dateToStr);
            System.out.println("Please Check GOODS,Receipt Before For you Leave ");
            System.out.println("GOODS HERE ARE NOT REFUNDABLE");

            System.out.println("||||||||||||||||||||||||||||||||||||||");
            System.out.println("26272862571910228282920082827282207224");
        }
    }


