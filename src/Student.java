public class Student extends People {
    static String indexNum;
    private static String age;

    public Student(String indexNum) { Student.indexNum = indexNum;
    }

    public Student() {

    }

    void greet () {
        System.out.println("Hello , I am also " +Student.name);
        System.out.println(" I am also a  " +Student.gender);
        System.out.println(" I am also " +Student.age+" years old and "+ Student.colour+ " in complexion");
    }


}
