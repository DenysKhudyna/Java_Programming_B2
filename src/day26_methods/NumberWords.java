package day26_methods;

public class NumberWords {
    public static String numberWord (int num) {
        String [] words = {"one", "two", "three", "four", "five", "six", "seven"};
if (num >0 && num <=7) {
        return words [num-1];
} else {return "not valid number";
}
        }


    public static void main(String[] args) {
        System.out.println(numberWord(10));
    }

}