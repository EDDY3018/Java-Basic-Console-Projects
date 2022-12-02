
    import java.util.Scanner;
    public class Frimpong {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int a, b;
            System.out.println("a");

            a = sc.nextInt();

            System.out.println("b");
            b = sc.nextInt();

            // Addition
            int sum = a + b;
            System.out.println("Sum =" + sum);

            //Subtraction
            int Sub = a - b;
            System.out.println("Sub = " + Sub);

            Scanner input = new Scanner(System.in);

            int result = input.nextInt();
            if (sum > Sub ) {
                System.out.println(" Sum answer is Greater than Sub ");
            } else if (Sub <= sum) {

                System.out.println("  Sub answer is LESS than OR EQUAL TO Sum");

            }
        }
    }



