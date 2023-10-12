package day19_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");

        }
        System.out.println("\t\tHello Universe");

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("\t\tHello World");

        }
        System.out.println("\t\t\t\tHello Universe");

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("\t\t\t\tHello World");
    }

        System.out.println("------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello World");
            }System.out.println("Hello Universe");

        }
}
}
