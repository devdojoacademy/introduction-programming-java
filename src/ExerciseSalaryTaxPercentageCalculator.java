/*
Create a class ExerciseSalaryTaxPercentageCalculator
Create a variable that can store a salary value
Create a second variable to store the tax percentage value
Create a third variable to store the amount we need to pay to a given salary and percentage
Print the amount in the console
*/
public class ExerciseSalaryTaxPercentageCalculator {
    public static void main(String[] args) {
        float salary = 5450.89F;
        float taxPercentage = 10;
        float taxAmountFromSalary = salary * (taxPercentage / 100);
        System.out.println(taxAmountFromSalary);
    }
}
