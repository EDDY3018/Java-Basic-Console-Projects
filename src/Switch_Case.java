import java.lang.invoke.SwitchPoint;
import  java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        //Write your code here
        Scanner scnr = new Scanner(System.in);
        int employeeNumber ; // change employee number type to int for the Switch.

        String employeeName;
        float hourlySalary;
        double weeklyTime,overTime,regularTime;
        double regularPay, overTimePay = 0,netPay;

        System.out.print(" Enter Employee Name: ");
        employeeName = scnr.nextLine();
        System.out.print("Enter Employee Number (00000): ");
        employeeNumber= scnr.nextInt();

        switch (employeeNumber){
            case 82500:
                employeeName = "Joe Odartey";
                break;
            case 82501:
                employeeName = "Isaac Effah";
                break;
            case 82502:
                employeeName = "Eyram Sokode";
                break;
            default:
                employeeName = " UNKNOWN";

        }

        System.out.print(" Enter Hourly Salary: ");
        hourlySalary = scnr.nextInt();
        System.out.println("Ener Weekly Salary:");
        weeklyTime = scnr.nextInt();


        if (weeklyTime < 40 ) {
            regularTime = weeklyTime;
            overTimePay = 0 ;
            netPay = regularPay = 0;
        }
        else {
            regularTime = 40 ;
            overTime = weeklyTime - 40;
            regularPay = hourlySalary *  40;
            overTimePay = hourlySalary * overTime;
            netPay = regularPay  + overTimePay;
        }

        System.out.println("=====================================");
        System.out.println("EYRAM BENZ BUS SERVICE");
        System.out.println("==-=-= Employee Payroll =-=-==");
        System.out.println("-------------------------------------");
        System.out.println("Employee #:      "  + employeeNumber);
        System.out.println(" Employee Name   "  + employeeName);
        System.out.println("Hourly Salary:   "  +    hourlySalary );
        System.out.println("Weekly Time:     "  + weeklyTime );
        System.out.println("Regular Pay:     "  +  regularPay);
        System.out.println("OverTime Pay:    "  +  overTimePay);
        System.out.println("Totsl Pay:       "  +  netPay);
        System.out.println("**************************************");
    }

}

