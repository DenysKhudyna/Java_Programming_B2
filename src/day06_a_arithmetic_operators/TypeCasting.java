package day06_a_arithmetic_operators;

public class TypeCasting {
    public static void main (String []args){
        byte b = 40;
        int i = b;

        System.out.println(b);
        System.out.println(i);


        int i2 = 100;
        byte b2 = (byte)i2;


        System.out.println(i2);
        System.out.println(b2);

        int i3 = 500;
        long l3 = i3;



long l2 = 200;
int l4 = (int)l2;
System.out.println(l2);
System.out.println(l4);

double d = 50;
int i5 = (int)d;

double d2 = 40;
byte b3 = (byte)d2;

System.out.println(i5);
System.out.println(d);


int i6 = 200;
byte b4 =(byte) i6;
System.out.println(i6);
System.out.println(b4);



    }
}
