
import java.util.Scanner;

import java.util.Scanner;

public class Joshua
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int months;

        for (months = 6; months>0; months--) {
            amount = amount * 90/100;
        }
        System.out.println(amount);
    }
}
//public class Joshua {
//
//        public static void main(String[] args) {
//            int loan;
//            double initial_amount,
//                    first_payment, remaining_Amount_AfterFirstMonth, second_payment, remaining_Amount_AfterSecondMonth,
//                    third_payment, remaining_Amount_AfterThirdMonth;
//
//            System.out.print("Enter the loan amount: ");
//            Scanner scanner = new Scanner(System.in);
//            loan = scanner.nextInt();
//
//            for (int i = 0; i < 1; i++) {
//                initial_amount = loan;
//                first_payment = (double  ) 10 / 100 * initial_amount;
//                remaining_Amount_AfterFirstMonth = initial_amount - first_payment;
//
//                second_payment = (double ) 10 / 100 * remaining_Amount_AfterFirstMonth;
//                remaining_Amount_AfterSecondMonth = remaining_Amount_AfterFirstMonth - second_payment;
//
//                third_payment = (double ) 10 / 100 * remaining_Amount_AfterSecondMonth;
//                remaining_Amount_AfterThirdMonth = remaining_Amount_AfterSecondMonth - third_payment;
//
//                System.out.printf("Remaining amount: %.2f", remaining_Amount_AfterThirdMonth);
//            }
//        }
//    }
