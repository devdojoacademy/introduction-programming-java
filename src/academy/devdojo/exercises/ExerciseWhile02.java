package academy.devdojo.exercises;

import java.util.Scanner;

/**
 * Create a program that will simulate a menu in the console
 * The menu should display the following
 * 1. Calculate taxes
 * 2. Deposit money
 * 3. Exit
 * Until the user types '3' the program must keep in execution. This will avoid us run the program every time
 */
public class ExerciseWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte option = 0;
        while(option != 3){
            System.out.println("1.Calculate taxes");
            System.out.println("2.Deposit money");
            System.out.println("3.Exit");
            option = scanner.nextByte();
        }
        System.out.println("Program finished");
    }
}
