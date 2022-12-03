import java.util.Scanner;
public class Trial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        People person = new People();
        Student stu = new Student();


        System.out.println(" Please enter your name ");
        person.setName(sc.nextLine());

        System.out.println(" Please enter your age ");
        person.setAge(sc.nextLine());

        System.out.println(" Are you a male or female ?\nEnter gender type ");
        person.setGender(sc.nextLine());

        System.out.println(" What is the shade of your Skin colour ");
        person.setColour(sc.nextLine());

        person.display();
        stu.greet();


    }

}
