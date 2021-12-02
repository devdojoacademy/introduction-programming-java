package academy.devdojo.exercises;

import java.util.Scanner;

/**
 * Using do-while, create an algorithm that will accept two distinct number inputs
 * If the numbers are equal, print true, if not print false
 * Give an option to the player decide if he wants to continue the game or stop after the result
 */
public class ExerciseDoWhile01 {
    public static void main(String[] args) {
        int shouldContinue = 1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input the first number");
            int num1 = input.nextInt();
            System.out.println("Input the second number");
            int num2 = input.nextInt();

            System.out.println("Are the numbers equal? "+ (num1 == num2));

            System.out.println("---------------------------");
            System.out.println("Would you like to continue");
            System.out.println("1. Yes");
            System.out.println("2. No");
            shouldContinue = input.nextInt();
        } while (shouldContinue == 1);
    }
}
