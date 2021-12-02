package academy.devdojo.loops;

public class DoWhile01 {
    public static void main(String[] args) {
        boolean condition = false;
        while(condition){
            System.out.println("Inside while");
        }

        do {
            System.out.println("Inside do-while");
        }while(condition);
    }
}
