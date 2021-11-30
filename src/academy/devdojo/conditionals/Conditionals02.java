package academy.devdojo.conditionals;

public class Conditionals02 {
    public static void main(String[] args) {
        // ==, !=, >, >=, <, <=
        float salaryManager = 5000;
        float salaryDeveloper = 4500;

        boolean isSalaryManagerGreaterThanDeveloper = salaryManager > salaryDeveloper;
        boolean isSalaryManagerGreaterOrEqualThanDeveloper = salaryManager >= salaryDeveloper;

        boolean isSalaryManagerLessThanDeveloper = salaryManager < salaryDeveloper;
        boolean isSalaryManagerLessOrEqualThanDeveloper = salaryManager <= salaryDeveloper;

        boolean isSalaryManagerEqualToDeveloper = salaryManager == salaryDeveloper;
        boolean isSalaryManagerDifferentThanDeveloper = salaryManager != salaryDeveloper;

        System.out.println("isSalaryManagerGreaterThanDeveloper "+isSalaryManagerGreaterThanDeveloper);
        System.out.println("isSalaryManagerGreaterOrEqualThanDeveloper "+isSalaryManagerGreaterOrEqualThanDeveloper);

        System.out.println("isSalaryManagerLessThanDeveloper "+isSalaryManagerLessThanDeveloper);
        System.out.println("isSalaryManagerLessOrEqualThanDeveloper "+isSalaryManagerLessOrEqualThanDeveloper);

        System.out.println("isSalaryManagerEqualToDeveloper "+isSalaryManagerEqualToDeveloper);
        System.out.println("isSalaryManagerDifferentThanDeveloper "+isSalaryManagerDifferentThanDeveloper);
    }
}
