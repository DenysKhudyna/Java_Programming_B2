package day15_string;

import java.util.Locale;
import java.util.Scanner;

public class TitleTwo {
    /*        ask the user to enter their name including titles
        use the following titles to determine how to refer to the person as

        handle case sensitivity. User could enter a title as ms, or MS, or Ms. All should result in a valid result

            titles:

                Mr or Mister ----- > Mr Tom
                Ms or Miss or Madam
                Dr

            and some titles can come after a name:

                Sr  --> Tom Sr
                Jr

        Based on both starting and ending titles print the following messages:

                Mr or Mister: Hello Sir
                Ms or Miss or Madam: Hello Ma'am
                Dr: Hello Doctor

                Sr: Nice to meet you Senior
                Jr: Nice to meet you Junior

        Note: It is possible to have both beginning and ending titles, one of them, or none of them

         */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name with title: ");
        String name = input.nextLine().toLowerCase();

        if (name.startsWith("mr.") || name.startsWith("mister")) {
            System.out.println("Hello Sir");
        }
        if (name.startsWith("ms.") || name.startsWith("miss") || name.startsWith("madam")) {
            System.out.println("Hello Me`am");
        }
        if (name.startsWith("dr.")) {
            System.out.println("Hello Doctor");
        }

        if (name.endsWith(" sr")) {  // name "Tesr"
            System.out.println("Nice to meet you Senior");
        } else if (name.endsWith("jr")) {
            System.out.println("Nice to meet you Junior");
        } else {
            System.out.println("No Senior or Junior");
        }


    }
}