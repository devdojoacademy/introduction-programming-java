package academy.devdojo.exercises;

public class ExerciseFor03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("----------------");
            for (int j = 1; j <= 12; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}
