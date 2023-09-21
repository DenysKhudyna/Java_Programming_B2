package day10_if_statements;

import java.util.Scanner;

public class CheckCharachter {   /*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
     */
    public static void main(String[] args) {
        char  letter = 'a';

        /* if UPPERCASE  -- > A >= letter <= Z --- > A >= letter && latter <= Z
        print uppercase
        if lowercase --- > a >= letter <= z --- > a >= letter && latter <= z
         */
        if ('A' >= letter && letter <= 'Z'){
            System.out.println("UPPERCASE");
        }
        if ('a' >= letter && letter <= 'z'){
            System.out.println("lowercase");
        }
    }
}
