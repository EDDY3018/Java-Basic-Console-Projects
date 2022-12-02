import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        String name = "Samuel Quainoo Kweku Souya";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isWhitespace(name.charAt(i))) ;
            count++;
        }
        System.out.println("The number of character in the string:" + count);


    }
}
