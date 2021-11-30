import java.util.Scanner;

/**
 * Create a program that allows users to input their username to be saved at a later date
 * The username cannot be empty ("") or be one of the following usernames: admin or administrator in any type of capital letters
 * If the user inputs valid data the message: <username> was registered successfully
 * Otherwise the system will show the message: Invalid username
 */
public class ExerciseConditionals05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type your username");
        String username = input.next();
        if (username.equals("") || username.equalsIgnoreCase("admin")
                || username.equalsIgnoreCase("administrator")) {
            System.out.println("Invalid username");
        }else {
            System.out.println(username + " was registered successfully");
        }
    }
}
