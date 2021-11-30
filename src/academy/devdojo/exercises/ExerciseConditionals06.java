package academy.devdojo.exercises;

import java.util.Scanner;

/**
 * The military needs a system to classify people joining the force
 * We need the system to accept the following data
 * Gender (the system should somehow store M or F only) and age.
 * If the gender is M (male) and age is >= 18, the system should print "Mandatory Service"
 * If the gender is M and the age is < 18, the system should print "Service not allowed for people under 18"
 * If the gender is F (female) and age is >= 18, the system should ask "Would you like to enlist?"
 * If the gender is F and age is < 18 the system should print "Service not allowed for people under 18"
 */
public class ExerciseConditionals06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your gender M. for Male or F. for female");
        char gender = input.next().charAt(0);
        if (gender != 'M' && gender != 'F' && gender != 'm' && gender != 'f') {
            System.out.println("Invalid gender");
            System.exit(0);
        }
        System.out.println("Type your age");
        int age = input.nextInt();

        if ((gender == 'M' || gender == 'F') && age < 18) {
            System.out.println("Service not allowed for people under 18");
        } else if (gender == 'F') {
            System.out.println("Would you like to enlist?");
        } else {
            System.out.println("Mandatory Service");
        }
    }
}
