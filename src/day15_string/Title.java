package day15_string;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a URl: ");
        String url = input.next().toLowerCase();
        System.out.println("Now, enter your name with title: ");
        String name = input.next();

        if (url.startsWith("www.") && url.endsWith(".com")) {
            System.out.println(name + " You entered correct URL which is " + url);
        } else {
            System.out.println("Invalid URL");
        }

    }
}
