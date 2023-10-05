package day13_string;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number - 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number - 2: ");
        int num2 = input.nextInt();
        System.out.println("Pick Operator:  \n\t+\n\t-\n\t*\n\t/\n\t%");
        String operator = input.next();
        String massage = "";
        boolean runOrNotRun = true;

        int result = 0;


        switch (operator) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                result = num1 / num2;
                break;
            case "%" :
                result = num1 % num2;
                break;
            default:
               massage = "Invalid Operator";
                runOrNotRun = false;
                break;
        }
        if (runOrNotRun) {
            System.out.println("You entered numbers which are " + num1 + " and " + num2 + "\nWhich the operator you selected, the result is " + result);
        } else {
            System.out.println(massage);
        }
        }

    }
