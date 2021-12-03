package academy.devdojo.exercises;

import java.util.Scanner;

public class ExerciseArrays04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        String resultsArray3 = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Array 1 Position " + i);
            array1[i] = scanner.nextInt();
            System.out.println("Array 2 Position " + i);
            array2[i] = scanner.nextInt();
            array3[i] = array1[i] * array2[i];
            resultsArray3 = resultsArray3 + array3[i] + " ";
        }

        System.out.println(resultsArray3);
    }
}
