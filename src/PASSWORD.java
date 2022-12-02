import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class PASSWORD {
    public static void main(String[] args) {

        Console console = System.console();

        console.printf("Please Enter Password: ");
        String  username = console.readLine();
        console.printf(username + "\n");

        console.printf("Please Enter your password: ");
        char[] passwordChars = console.readPassword();
        String passwordString = new String(passwordChars);

        console.printf(passwordString + "\n");

    }
}

