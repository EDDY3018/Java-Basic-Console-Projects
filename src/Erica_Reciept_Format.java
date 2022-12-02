
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
    public class  Erica_Reciept_Format {
        static class Pharmacy {
            String item;
            int quantity; double discount,unit_price,total,bill_total,tax_rate,vat,net_value,cash_paid, balance;
            double discountPercentage, discounted_money, vatPercentage, taxPercentage;
            double tax_on_money, vat_on_money,discount_on_money;

            DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String dateTime = date.format(now);


            void userInput(){
                Scanner get = new Scanner(System.in);
                System.out.println("\t\t\tGOODWILL PHARMACY");
                System.out.println("\tEmail: retail@goodwillpharmacy.com");
                System.out.println("\t\tNear Accra Technical University - Barnes Road");
                System.out.println("\t03303302390/ 0203230923 / 023402342 ");

                System.out.println("Enter Details For Items Purchased........");
                System.out.print("Item Name: ");
                item = get.nextLine();//The nextLine() method of the java. util. Scanner class scans from the current position until it finds a line separator delimiter.

                System.out.print("Item Quantity: ");
                quantity = get.nextInt();


                System.out.print("Discount on Item: ");
                discount = get.nextDouble();

                System.out.print("Unit Price: ");
                unit_price = get.nextInt();

                System.out.print("Cash Paid: ");
                cash_paid = get.nextInt();//The nextInt() method Scans the next token of the input as an int.

                System.out.print("Tax Rate: ");
                tax_rate = get.nextDouble();//The nextDouble() method Scans the next token of the input as an int.

                System.out.print("VAT: ");
                vat = get.nextDouble();

                System.out.print("Total: ");
                total = get.nextDouble();


                System.out.print("Net Value: ");
                net_value = get.nextDouble();
                System.out.println("\n\n");

            }

            void displayReceipt(){
                discountPercentage = discount / 100;
                discounted_money = unit_price * discountPercentage;
                discount_on_money = unit_price - discounted_money;
                bill_total = discount_on_money * quantity;

                taxPercentage = tax_rate / 100;
                tax_on_money = total * taxPercentage;

                vatPercentage = vat / 100;
                vat_on_money = bill_total * vatPercentage;

                net_value = bill_total - discounted_money - tax_on_money - vat_on_money;

                balance = cash_paid - bill_total;


                System.out.println("\t\t\tGOODWILL PHARMACY");
                System.out.println("\tEmail: retail@goodwillpharmacy.com");
                System.out.println("\t\tNear Accra Technical University - Barnes Road");
                System.out.println("\t03303302390/ 0203230923 / 023402342 \n");

                System.out.println("\t\t\t\t\t\t\t\t\tOriginal Receipt");
                System.out.println("\tTIN No:\tC0008657");
                System.out.println("\tItem(s)");
                System.out.println("\tPrice\tDisc.\t\tQty\t\tTotal");
                System.out.println("\t--------------------------------------------------");
                System.out.println("\t"+this.item);
                System.out.println("\t"+this.unit_price+"\t"+this.discount+"\t\t\t\t"+this.quantity+"\t\tGH₵ "+total);
                System.out.println("\t--------------------------------------------------");
                System.out.println("\tBill Total\t\t\t\t\t\t\t\t\t"+bill_total);

                double none = ((taxPercentage == 0.0) ? 0.0: tax_on_money);
                System.out.println("\tTax rate\t\t\t\t"+taxPercentage+"\t\t\t\t\t"+none);
                System.out.println("\tVAT\t\t\t\t\t\t\t\t\t\t\t"+"GH₵"+vat_on_money);
                System.out.println("\tNet Value\t\t\t\t\t\t\t\t\t"+"GH₵"+net_value);
                System.out.println("\tCASH\t\t\t\t\t\t\t\t\t\t"+"GH₵"+cash_paid);

                double no_balance = ((bill_total == cash_paid) ? 0.0:balance);
                System.out.println("\tBALANCE\t\t\t\t\t\t\t\t\t"+"\tGH₵"+no_balance+"\n");
                System.out.println("\tPlease check goods, receipt and cash.");
                System.out.println("\tGoods sold are not refundable.");
                System.out.println("\t\t\t"+dateTime);

                System.out.println("\t|||||||||||||||||||||||||||||||||");
                System.out.println("\t129349449555569660770770543333333");


            }

        }


        public static void main(String[] args) {

            Pharmacy receipt = new Pharmacy();

            receipt.userInput();
            receipt.displayReceipt();


        }
    }

