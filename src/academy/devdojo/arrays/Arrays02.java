package academy.devdojo.arrays;

public class Arrays02 {
    public static void main(String[] args) {
        String[] names = new String[3];//[Kurosaki][Rukia][Inoue]
        names[0] = "Kurosaki";
        names[1] = "Rukia";
        names[2] = "Inoue";

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
}
