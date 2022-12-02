
    //RECURSION
    public class FACTORIAL {

        static int factorial(int n){
            if (n == 0)

                return 1;
            else
                return(n * factorial(n-1));
        }
        public static void main(String args[]){
            int i,fact=1;

            int number=13;//It is the number to calculate factorial

            fact = factorial(number);

            System.out.println("Factorial of "+ number+" is: "+ fact);
        }

    }

