import java.util.Scanner;

public class joel {
    public static void main(String[] args) {
        int sum = 0;
        int [] numbers = new int[]  {0,1,2,3,4,5,6,7,8,9};

       int i = 0;

        for(i = 0; i < numbers.length; i++);
        System.out.println(numbers [i]  +" ");
        sum = sum + numbers[i];


        System.out.println("sum" + sum);
        int length = numbers.length;
        float average = sum / length;
        System.out.println("average:" + average);
        System.out.println("Reverse order:");

        for (i = numbers.length - 1; i>=0; i--){

            System.out.println(numbers[i] + " ");
        }

    }
}

//// Different way of coding a BMI!!!!!
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        double height ;
//        double weight ;
//
//        String kg;
//        String ft;
//
//        System.out.println("Please Enter your height:");
//        height = sc.nextInt();
//        System.out.println("Please Enter your weight:" + "kg");
//        weight = sc.nextInt();
//        System.out.println("Current Bmi " + (weight / (height * height) * 703));