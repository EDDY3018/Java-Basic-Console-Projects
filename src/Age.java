import java.util.Scanner;
public class Age {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name,country;
        int age,year;

        System.out.println("Hello User !!!! \n Enter your Details ");
        System.out.println(" ");

        System.out.println(" FullName");
        name = sc.nextLine();


        System.out.println(" Your Country ");
        country = sc.nextLine();

        System.out.println(" Year you were born ");
        year = sc.nextInt();
        System.out.println("");

        System.out.println("******************************************");

        age= 2022-year;
        //Display Outcome
        System.out.println("Your name is " + name + ",you are " + age + " years old and you come from " + country );

    }
}
