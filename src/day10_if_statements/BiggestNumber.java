package day10_if_statements;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println("Biggest one " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("Biggest one " + num2);
        }else {
            System.out.println("Biggest one " + num3);}
    }
}
