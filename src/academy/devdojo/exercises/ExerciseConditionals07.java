package academy.devdojo.exercises;

import java.util.Scanner;

/**
 * Create a program that will print "Weekday" for Mon, Tue, Wed, Thru, Fri
 * and "Weekend" for Sat and Sun based on the number entered by the user
 * Consider 1 for Sun and 7 to Sat. Any other number should display the message "Invalid Input"
 */
public class ExerciseConditionals07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of the day of the week, consider 1 for Sunday and 7 for Saturday");
        int day = scanner.nextInt();

        switch (day) {
            case 1, 7 -> System.out.println("Weekend");
            case 2, 3, 4, 5, 6 -> System.out.println("Weekday");
            default -> System.out.println("Invalid Input");
        }
    }
}
