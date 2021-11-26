/*
Given a salary
If the salary is greater than 5000 print in the console the value of 30% of the salary
Otherwise print only 15% of the salary's value.
[Second part]
Challenge 1: Only use one System.out.println to print the value
Challenge 2: Still using one System.out.println also print if it is 15% or 30%
*/

public class ExerciseConditionals01 {
    public static void main(String[] args) {
        double salary = 2000;
        double result = 0;
        String percentageValue = "";
        if (salary > 5000) {
            result = salary * 0.3;
            percentageValue = "30% = " + result;
        } else {
            result = salary * 0.15;
            percentageValue = "15% = " + result;
        }

        System.out.println(percentageValue);

    }
}
