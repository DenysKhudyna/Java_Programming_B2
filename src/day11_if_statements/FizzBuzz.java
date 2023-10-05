package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int numm = input.nextInt();
        String massage = "" + numm;
        if (numm % 5 == 0) {
            massage = "Buzz";
        } if (numm % 3 == 0) {
            massage = "Fizz";
        }if (numm % 3 == 0 && numm % 5 == 0) {
            massage = "FizzBuzz";
        }

            System.out.println(massage);

    }
}
