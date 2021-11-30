package academy.devdojo.exercises;

/*
Given a number
If the number is even print the message: The number: <number> is even
Else print the message The number: <number> is odd
*/
public class ExerciseConditionals02 {
    public static void main(String[] args) {
        int number = 1;
        if((number % 2) == 0){
            System.out.println("The number: "+number+" is even");
        }else{
            System.out.println("The number: "+number+" is odd");
        }
    }
}