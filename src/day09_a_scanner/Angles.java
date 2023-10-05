package day09_a_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        System.out.println("Enter three angle degree: ");
        Scanner input = new Scanner(System.in);
        double angleOne = input.nextDouble();
        double angleTwo = input.nextDouble();
        double angleThree = input.nextDouble();

        double sum = angleTwo + angleOne + angleThree;
        boolean isTriangle = sum == 100;
        boolean isCircle = sum == 360;
        System.out.println("It is a triangle: " + isTriangle);
        System.out.println("It is a circle: " + isCircle);
    }
}
