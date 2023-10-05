package day12_switch_statements;

import java.util.Scanner;

public class Starbucks {
    /*

Declare price and calories variables

Ask the user to enter which size drink they want

Based on the drink size determine the price and calories of the order

At the end print the details of the order

    data:

        size: tall
        price: 2.50
        calories: 100

        size: grande
        price: 4.00
        calories: 150

        size: venti
        price: 4.50
        calories: 200

 */

    public static void main(String[] args) {
        double price = 0;
        int calories = 0;
        Scanner input = new Scanner (System.in);
        System.out.println("What size of drink do you want? ");
        String size = input.next();
        boolean isValid = true;
        switch (size) {
            case "tall":
                price = 2.5;
                calories = 100;
                break;

            case "grande":
                price = 4.00;
                calories = 150;
                break;
            case  "venti":
                price = 4.50;
                calories = 200;
                break;
            default:
                System.out.println("We do not have this size");
                isValid = false;
        }
        if (isValid) {
            System.out.println("Your order for " + size + " coffee is $ " + price + " and has " + calories + " calories.");

        }




    }
}
