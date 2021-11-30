package academy.devdojo.conditionals;

public class Conditionals03 {
    public static void main(String[] args) {
        int firstAge = 20;
        int secondAge = 22;
        // if firstAge >= secondAge: first age is greater or equal
        // else firstAge is not greater or equal
        boolean isFirstAgeGreaterOrEqualThanSecondAge = firstAge >= secondAge;
        if(firstAge >= secondAge){
            System.out.println("first age is greater or equal second age");
        }else{
            System.out.println("first age is not greater or equal second age");
        }
    }
}
