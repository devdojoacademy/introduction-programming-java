public class Conditionals06 {
    public static void main(String[] args) {
       float ps5Price = 500;
       double creditCardAvailableCredit = 5000;
       double checkingAccountBalance = 400;
       double savingsAccountBalance = 200;
       if(creditCardAvailableCredit > ps5Price || checkingAccountBalance > ps5Price || savingsAccountBalance > ps5Price){
           System.out.println("I can buy a PS5");
       }else {
           System.out.println("Let's buy next month");
       }
    }
}
