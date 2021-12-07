package academy.devdojo.arrays;

import java.util.Scanner;

public class MultiArrays03 {
    public static void main(String[] args) {
        int[][] multiArray = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.println("[%d][%d]".formatted(i, j));
                multiArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.printf("[%d][%d] = %d%n",i, j, multiArray[i][j]);
            }
        }
    }
}
