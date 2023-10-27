package day26_methods;

public class FrequencyOfCharacters {
    public static int frequencyOfCharacters (String word, char letter){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("Apple",'p'));
    }
}
