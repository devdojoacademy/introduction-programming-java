/*
Given an age, find the best category to fit that person
< 13 = "Kids"
>= 13 and <=16 = "Juvenile"
> 16 = "Adult"
Restrictions: Only use one System.out.println
*/
public class ExerciseConditionals03 {
    public static void main(String[] args) {
        int age = 13;
        String category = "";
        if (age < 13) {
            category = "Kids";
        } else if (age >= 13 && age <= 16) {
            category = "Juvenile";
        } else {
            category = "Adult";
        }
        System.out.println("The category is " + category);
    }
}
