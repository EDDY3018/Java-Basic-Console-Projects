import java.util.Scanner;
public class Erica_Retial {
    public static void main(String[] args) {
        double priceOneShirt;
        double pricePairOfPants;
        double priceOneDress;
        String customerName = null, homePhone;
        int numberOfShirts, numberOfPants, numberOfDresses;
        int totalNumberOfItems;
        double subTotalShirts, subTotalPants, subTotalDresses;
        short orderMonth, orderDay, orderYears;

        final double discountRate = 0.15;

        Scanner sc = new Scanner(System.in);

        //Input customer details
        System.out.println("Welcome to Erica Retail Services");
        System.out.println("Please enter customer's name: ");
        customerName =sc.next();
        System.out.println("Please enter customer's home phone number: ");
        homePhone =sc.next();

        //Input price details
        System.out.println("\nEnter the price of one shirts: ");
        priceOneShirt = sc.nextDouble();
        System.out.println("Enter price for a pair of pants: ");
        pricePairOfPants = sc.nextDouble();
        System.out.println("Enter the price of one dresses: ");
        priceOneDress = sc.nextDouble();

        //Input number of items bought
        System.out.println("\nEnter the number of  shirts bought: ");
        numberOfShirts = sc.nextInt();
        System.out.println("Enter the number of  pants bought: ");
        numberOfPants = sc.nextInt();
        System.out.println("Enter the number of  dresses bought: ");
        numberOfDresses = sc.nextInt();


        //Input calender details
        System.out.println("\nEnter details of transaction date below");
        System.out.println("*******************************************************");
        System.out.println("\nEnter month number: ");
        orderMonth = sc.nextShort();
        System.out.println("\nEnter Day-number: ");
        orderDay = sc.nextShort();
        System.out.println("\nEnter year: ");
        orderYears = sc.nextShort();

        //Perform calculations
        totalNumberOfItems = numberOfShirts + numberOfPants + numberOfDresses;
        subTotalShirts = numberOfShirts *  priceOneShirt;
        subTotalPants = numberOfPants * pricePairOfPants;
        subTotalDresses = numberOfDresses * priceOneDress;

        double totalOrder = subTotalShirts + subTotalPants + subTotalDresses;

        //Display Invoice

        System.out.println("/n-/-\tErica Retail Services\t-/-");
        System.out.println("-------------------------------------------------------");
        System.out.println("Customer: " + null);
        System.out.println("Contact Number: "+homePhone);
        System.out.println("Order Date: "+orderDay+ "/" + orderMonth+ "/ " + orderYears );
        System.out.println("-------------------------------------------------------");
        System.out.println("Items\tQty\tUnit/Price\tSub-Total");

        System.out.println("Shirts\t" +numberOfShirts+"\t$" +priceOneShirt+ "\t\t$"+subTotalShirts );
        System.out.println("Pants\t" +numberOfPants+"\t$" +pricePairOfPants+ "\t\t$"+subTotalPants );
        System.out.println("Dresses\t" +numberOfDresses+"\t$" +priceOneDress+ "\t\t$"+subTotalDresses );

        System.out.println("------------------------------------------------------");
        System.out.println("Number of Items: "+ totalNumberOfItems);
        System.out.println("Total Number: $" + totalOrder);
        System.out.println("Total Discount: $" + totalOrder * discountRate);
        System.out.println("======================================================");
        System.out.println();
        System.out.println("Created by Erica, 0282903209949");



    }
}
