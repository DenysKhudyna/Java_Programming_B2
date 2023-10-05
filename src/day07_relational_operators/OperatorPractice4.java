package day07_relational_operators;

public class OperatorPractice4 {
    public static void main (String []args){

        int t =100;
        int p = - ++t * -t-- / t++ + --t;
        System.out.println("t: " + t);
        System.out.println("p: " + p);


    }
}
