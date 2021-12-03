package academy.devdojo.arrays;

public class Arrays01 {
    public static void main(String[] args) {
        double grade01 = 9.5;
        double grade02 = 2.5;
        double grade03 = 7;
        double average = (grade01 + grade02 + grade03) / 3;
        System.out.println(average);

        double[] grades = new double[3];
        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);

        grades[0] = 9.5;
        grades[1] = 2.5;
        grades[2] = 7;

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);

        System.out.println("The length of the array is "+grades.length);
        average = (grades[0] + grades[1] + grades[2]) / grades.length;
        System.out.println("Average "+average);
    }
}
