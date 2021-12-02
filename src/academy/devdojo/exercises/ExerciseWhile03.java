package academy.devdojo.exercises;

import java.util.Scanner;

/**
 * Create a program that will show a menu to the user asking for a username and then a password.
 * The correct username and password must be stored already in variables.
 * If the user types de correct username and password, the system should display "ACCESS GRANTED"
 * otherwise it should print "ACCESS DENIED" and ask the username and password again.
 * This combination should keep going until the user enter the correct username and password.
 */

public class ExerciseWhile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usernameSaved = "luffy";
        String passwordSaved = "king";
        while (true) {
            System.out.println("Username:");
            String username = scanner.nextLine();
            System.out.println("Password:");
            String password = scanner.nextLine();
            if (username.equals(usernameSaved) && password.equals(passwordSaved)) {
                System.out.println("ACCESS GRANTED");
                break;
            }
            System.out.println("ACCESS DENIED");
        }
        System.out.println("Program finished");
    }
}
