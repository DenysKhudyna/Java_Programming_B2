package day09_a_scanner;

import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("What is the day of week? ");
        String day = input.nextLine();

        System.out.println("Enter your first name: ");
        String name = input.nextLine();




        System.out.println("Enter your last name: ");
        String lastName = input.next();

        input.nextLine();
        System.out.println("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Enter your bank account username: ");
        String userName = input.nextLine();


        System.out.println("Today: " + day);
        System.out.println("First Name: " + name);
        System.out.println("Lastname: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Your bank account username: " + userName);


    }
}
