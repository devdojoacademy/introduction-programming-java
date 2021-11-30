package academy.devdojo.conditionals;

public class Conditionals07 {
    public static void main(String[] args) {
        float income = 12000.0F;
        //$9,951 to $40,525
        // $40,526 to $86,375
        if(income <= 9550){
            System.out.println("10% = "+ (income * 0.1));
        }else if(income >= 9551 && income <= 40525){
            System.out.println("12% = "+ (income * 0.12));
        }else if(income >= 40526 && income <= 86375) {
            System.out.println("22% = "+ (income * 0.22));
        }else {
            System.out.println("30% = "+ (income * 0.30));
        }
    }
}
