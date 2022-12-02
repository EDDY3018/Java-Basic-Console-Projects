import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double perimeter=0;

        double area;
        double p = 3.14519;// p means pie.

        int fst_input = 0;
        int snd_input ;
         double circle ;

        area = fst_input * 5; //6.5 is the radius.
        //perimeter= 2*p*6.5;

        System.out.println("First Input " );
        fst_input = sc.nextInt();

        System.out.println("Second Input ");
        snd_input = sc.nextInt();

        circle = p * snd_input * 2;
        System.out.println("The area of the square is " + fst_input * 5 +

                  ", while the area of the circle is PI * " + snd_input * 2 + " = " + circle );


//        System.out.println("The circle is " + circle);


    }
}


