//import java.util.Scanner;
public class Reverse_Order {



    public static void main(String[] args) {
        int sum = 0;
        int [] numbers = new int [] {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Correct way:");

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
            sum = sum + numbers[i];
        }
        System.out.println("Sum:" + sum);
        int length = numbers.length;

        float average = sum / length;
        System.out.println("Average:" + average);

        System.out.println("Reverse order:");

        for (int i = numbers.length-1; i >=0;i--) {

            System.out.println(numbers[i] + " ");

        }
    }
}

