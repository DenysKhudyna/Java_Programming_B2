package day06_b_unary_operators;

public class IncrementExample {
    public static void main (String []args){

        int x =0;
        System.out.println(x);



x = x=1;
        System.out.println(x);

        // in java there is shorter way to write x+1; in two options: POST-Increment and PRE-INCREMENT
        // Post-Increment
        x++; // this will increase the value by 1 --> x = x +1; --> 1 +1 = 2
        System.out.println(x);

// PRE-INCREMENT
        ++x; // this will increase the value by 1 --> x = x +1; --> 2 +1 = 3
        System.out.println(x);

        //Q: then what is the differentce? Why do we two version?
        System.out.println(++x); //PRE-INCREMENT it will update the x first and them print

        System.out.println(x++); // POST-Increment it will print first and them update x
        System.out.println(x);


    }
}
