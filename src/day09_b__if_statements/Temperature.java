package day09_b__if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main (String [] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = key.nextInt();
        boolean result = temp >= 70;
        if (result){
            System.out.println("It is nice day\nGo out side, but with your laptop to code java ");
        } else {
            System.out.println("It is too cold\nCode more Java");
        }


    }
}
