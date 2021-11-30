package academy.devdojo.conditionals;

public class Conditionals05 {
    public static void main(String[] args) {
        String savedName = "Alucard";
        String savedCreditCardNumber = "123";
        String savedSecurityCode = "300";

        String inputName = "Alucard";
        String inputCreditCardNumber = "123";
        String inputSecurityCode = "300";

        if(savedSecurityCode.equals(inputSecurityCode) && savedName.equals(inputName) && savedCreditCardNumber.equals(inputCreditCardNumber)){
            System.out.println("Can buy");
        }else{
            System.out.println("Cannot buy");
        }

//        if(savedCreditCardNumber.equals(inputCreditCardNumber)){
//            System.out.println("same credit card");
//        }
//        if(savedSecurityCode.equals(inputSecurityCode)){
//            System.out.println("same security code");
//        }

    }
}
