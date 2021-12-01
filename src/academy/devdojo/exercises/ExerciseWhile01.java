package academy.devdojo.exercises;

import java.util.Scanner;

/**
 * Given a number entered by the user
 * print all the odd numbers starting from zero until the number given by the user
 */
public class ExerciseWhile01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type a positive number");
        int finalValue = input.nextInt();
        // 0,1,2,3 -> finalValue
        int i = 1;
        while (i <= finalValue) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
