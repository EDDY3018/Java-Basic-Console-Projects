package Employee;

import java.io.PrintStream;

public class Employee extends Lawyer {
    private static boolean vacationForm;
    private boolean hours;
    private Object salary;

    public static void main(String[] args) {
        Employee Edna = new Employee();
        Lawyer Lucy = new Lawyer();
        Secretary Stan = new  Secretary();
        Employee Leo = new Employee();

        printInfo(Edna);
        printInfo(Lucy);
        printInfo(Stan);
        printInfo(Leo);

    }


    }


        System.out.print(new StringBuilder().append(e.getHours()).append(" , ").toString());
        try (PrintStream printf = System.out.printf("GHS%.2f, ", e.getSalary())) {
        }
        System.out.print(e.getVacationDays() + " ,");
        System.out.println(new StringBuilder().append(getVacationForm()).append(" ,").toString());
        System.out.println(e); // toString representation of employee
    }

    private static boolean getVacationForm() {
        return false;
    }

}
