
import java.util.Scanner;

public class Main_Progrram {
    public static void main(String[] args) {

        double priceOneShirt;
        double priceAPairOfPants;
        double priceOneDress;
        String customerName, homePhone;
        int numberOfShirt,numberOfPants, numberOfDresses;
        int totalNumberOfItems;
        double subTotalShirts, subTotalPants, subTotalDresses;
        double totalOrder;
        short orderMonth, orderDay, orderYear;

        final double discountRate = 0.15;

        Scanner sc = new Scanner(System.in);//sc is an object of the Scanner class

        //Input customer details
        System.out.println("Welcome to Eyarm Rentails Services");
        System.out.println("Please Enter customers name:  ");//Leave space after name to make writing clear
        customerName = sc.nextLine();
        System.out.println("Please Enter customer's home phone number: ");
        homePhone =sc.next();

        //Input price details
        System.out.println("\nEnter the price of one Shirt: ");
        priceOneShirt = sc.nextDouble();
        System.out.println("Enter price for a pair of pants: ");
        priceAPairOfPants = sc.nextDouble();
        System.out.println("Enter the price of one Dress: ");
        priceOneDress = sc.nextDouble();

        //Input number of items bought
        System.out.print("\nEnter number of Shirt bought: ");
        numberOfShirt = sc.nextInt();
        System.out.print("Enter number of pants bought: ");
        numberOfPants =sc.nextInt();
        System.out.println("Enter number of dresses  bought: ");
        numberOfDresses = sc.nextInt();

        // Input calendar details
        System.out.println("\nEnter details of Transaction  date below ");
        System.out.println("******************************************");
        System.out.println("Enter Month number");
        orderMonth = sc.nextShort();
        System.out.println("Enter Day- Number ");
        orderDay = sc.nextShort();
        System.out.println("Enter Year ");
        orderYear = sc.nextShort();

        // Perform Calculations
        totalNumberOfItems = numberOfDresses + numberOfPants + numberOfShirt;
        subTotalDresses = numberOfDresses * priceOneDress;
        subTotalPants = numberOfPants * priceAPairOfPants;
        subTotalShirts = numberOfShirt * priceOneShirt;

        totalOrder = subTotalDresses + subTotalPants + subTotalPants;
        //Display Invoice

        System.out.println("\n-/-\tEyram Retail Service\t-/-");
        System.out.println("==========================================");
        System.out.println("Customer:" + customerName);
        System.out.println("Contact Number: " + homePhone);
        System.out.println("OderDay: " + orderDay+ "/" +orderMonth+ " / "+orderYear);
        System.out.println("------------------------------------------");
        System.out.println("Iteam\tQty\tUnit\tPrice\tSub-Total");

        System.out.println("Shirts\t" +numberOfShirt+ "\t$" +priceOneShirt+ "\t$" +subTotalShirts);

        System.out.println("Pants\t" +numberOfPants+ "\t$" +priceAPairOfPants+ "\t$" +subTotalPants);

        System.out.println("Dresses\t" +numberOfDresses+ "\t$" +priceOneDress+ "\t$" +subTotalDresses);

        System.out.println("------------------------------------------");
        System.out.println("Number Of Iteams: " + totalNumberOfItems);
        System.out.println("Total Order: $ " +totalOrder);
        System.out.println("Total Number: $ " +totalOrder * discountRate);
        System.out.println("==========================================");
        System.out.println();
        System.out.println("Created by a Student Name , index number");




    }
}

