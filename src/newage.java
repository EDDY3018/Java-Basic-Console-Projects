import java.util.Scanner;
public class newage {
    public static void main(String[] args) {
    String name;
    int birthYear,curyear = 2021,age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME ");
         name =sc.nextLine();
        System.out.println("Enter your year of birth");
        age = sc.nextInt();
        birthYear= curyear-age;
        System.out.println(" My name is " + name +", I am " + birthYear + " years old ");

    }
}


