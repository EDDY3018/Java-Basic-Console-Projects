
class Secretary extends Employee {
    public void takeDictation(String  text ) {
        System.out.println("Dictation text: " + text );
    }
}

public class EmployeeMain {

    public static void main(String[] args) {
        System.out.print("Employee: ");
        Employee edna = new Employee();
        System.out.print(edna.getHours() + " , ");
        System.out.printf("GHS%.2f, " ,edna.getSalary());
        System.out.println(edna.getVacationDays() + " , ");
        System.out.println(edna.getVacationsForm());


        System.out.print("Secretary: ");
        Secretary stan = new Secretary();
        System.out.print(stan.getHours() + " , ");
        System.out.printf("GHS%.2f,  ", stan.getSalary());
        System.out.print(stan.getVacationDays() + " ,");
        System.out.println(stan.getVacationsForm());
        stan.takeDictation("hello");
    }
}
