package day12_switch_statements;

import java.util.Scanner;

public class Schedule {/*
 Task:

    Ask the user to enter which day it is
    print which class we have on that day, and the time of the class

    topic with instructor at time

    challenge:
        make each day flexible

            monday
            Monday
            mon

         reduce repeating code

 */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What day of week is it and what is it about? ");
        String day = input.next();
        String result = "";
        switch (day) {
            case "Monday":
                result = "No classes for now";
                break;
            case "Tuesday":
                result = "No classes. Champions league doing Java tasks";
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                result = "We are having Java classes with Feyruz";
                break;
            case "Friday":
                result = "No classes but get ready for Saturday long hours";
                break;
            case "Sunday":
                result = "It is kind of no class ";
                break;
            default:
                result = "Not invalid day of week";
        }
        System.out.println(result);


    }
}
