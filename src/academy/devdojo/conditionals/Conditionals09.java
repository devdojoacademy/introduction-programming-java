package academy.devdojo.conditionals;

public class Conditionals09 {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("M");
                break;
            case 3:
                System.out.println("T");
                break;
            case 4:
                System.out.println("W");
                break;
            case 5:
                System.out.println("T");
                break;
            case 6:
                System.out.println("F");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day (inside switch)");
        }

        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("M");
            case 3 -> System.out.println("T");
            case 4 -> System.out.println("W");
            case 5 -> System.out.println("T");
            case 6 -> System.out.println("F");
            case 7 -> System.out.println("S");
            default -> System.out.println("Invalid date");
        }
    }
}
