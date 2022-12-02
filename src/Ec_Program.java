import java.util.Scanner;
public class Ec_Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        String country;

        System.out.println("Enter your Country of Origin ");
        country = sc.next();

        System.out.println("Enter your age:");
        age = sc.nextInt();

        Ec_Program myObj = new Ec_Program();

        String results = myObj.eligibility(country, age);
        System.out.println(results);
    }

    public static String eligibility(String country, int age) {
        if (country.equalsIgnoreCase("  Ghana ") && age >= 18) {
            return "You are eligible to vote. ";
        } else {
            return ("SORRY ,You are not  eligible to vote. ");
        }


    }

}


