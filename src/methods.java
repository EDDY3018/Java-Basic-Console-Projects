
import com.questionAccepter;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class methods {
    private static boolean result;

    public static void main(String[] args) {
        //write your code here

        questionAccepter acceptor = new questionAccepter();
        int question =    JOptionPane.showConfirmDialog(null,
                "Do you want go out for a break ?",
                "Break Prompt", JOptionPane.INFORMATION_MESSAGE);
       boolean result = acceptor.studentBreak(question);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First name ");
        String fName = sc.next();
        System.out.println("Enter your Last name ");
        String lName = sc.next();
        System.out.println("Enter your Middle name ");
        String mName = sc.next();
        System.out.println("Enter your Index Number ");
        String indexNo = sc.next();
        System.out.println("Enter your Department ");
        String department = sc.next();
        System.out.println("Enter your Faculty ");
        String faculty = sc.next();
        System.out.println("Enter your Email ");
        String email = sc.next();
        System.out.println("Enter your Phone ");
        String phone = sc.next();
        System.out.println("Enter your Occupation ");
        String occupation = sc.next();
        System.out.println("Enter your Level ");
        String level = sc.next();
        System.out.println("Enter your Program ");
        String program = sc.next();
        System.out.println("Enter your Sex ");
        String sex = sc.nextLine();
        System.out.println("Enter your Age ");
        int age = sc.nextInt();
        System.out.println("Enter your Fees ");
        double fees = sc.nextDouble();

        StudentDetails details = new StudentDetails(fName, lName, mName, indexNo, department,faculty, email,phone, occupation,level, program,sex,age,fees);

        System.out.println("============================================");
        System.out.println(details.getfName());
        System.out.println(details.getlName());
        System.out.println(details.getmName());
        System.out.println(details.getIndexNo());
        System.out.println(details.getDepartment());
        System.out.println(details.getFaculty());
        System.out.println(details.getEmail());
        System.out.println(details.getPhone());
        System.out.println(details.getOccupation());
        System.out.println(details.getLevel());
        System.out.println(details.getProgram());
        System.out.println(details.getSex());
        System.out.println(details.getAge());
        System.out.println(details.getFees());


    }

    //write a method asking the user if he or she wants to go for break

    public static void studentBreak(int question) {

        if (result) {
            JOptionPane.showMessageDialog(null, "YES GO FOR BREAK");
        } else {
            JOptionPane.showMessageDialog(null, "NO STAY IN CLASS");
        }




    }
}