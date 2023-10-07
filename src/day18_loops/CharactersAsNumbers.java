package day18_loops;

public class CharactersAsNumbers {
    public static void main(String[] args) {
        String str = "loop";  // length(); --- > 4
        //            0123

        for (int i = 0; i < str.length(); i++) {
            System.out.print((int)str.charAt(i) + " ");
        }



    }

}
