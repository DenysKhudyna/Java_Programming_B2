package day05_variables;

public class MyName {


    /*
           create a class MyName
           create a main method
           create multiple char variables, one for each letter of your name
           print your name
               print each letter in a different line
               print your name in the same line
    */



    public static void main(String []args) {

char first = 'D';
char second = 'e';
char three = 'n';
char four = 'y';
char five = 's';


System.out.println(first + second + three + four + five);
System.out.println("My name is " + first + second + three + four + five);


String myName = "" + first + second + three + four + five;
        System.out.println("My name is " + myName);

    }
}
