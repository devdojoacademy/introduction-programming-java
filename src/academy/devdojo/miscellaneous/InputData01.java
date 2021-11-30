package academy.devdojo.miscellaneous;

import java.util.Scanner;

public class InputData01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, type your name:");
        String name = input.next();
        System.out.println("Now, type your age");
        int age = input.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
