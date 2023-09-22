package day11_if_statements;

public class Diver {
    public static void main (String[] args) {
        String massage = "hello";
        int oxygenLevel = 99;
        if (oxygenLevel >= 90){
            System.out.println("Your tank is full");
        } else if (oxygenLevel >= 80) {
            System.out.println("Still okay");
        } else if ( oxygenLevel >= 70) {
            System.out.println("Do not go too far");
        } else if (oxygenLevel >= 60){
            System.out.println("Start to head back");
        }else if (oxygenLevel >= 50){
            System.out.println("Be careful now you at 50%");
        }
        System.out.println("*****************************************");

        if (oxygenLevel >= 90){
            massage = "Your tank is full";
        } else if (oxygenLevel >= 80) {
            massage = "Still okay";
        } else if ( oxygenLevel >= 70) {
            massage = "Do not go too far";
        } else if (oxygenLevel >= 60){
            massage = "Start to head back";
        }else if (oxygenLevel >= 50) {
            massage = "Be careful now you at 50%";
        }
        System.out.println(massage);
    }
}
