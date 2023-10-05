package day11_if_statements;

public class AmazonPrime {
    public static void main(String[] args) {
        double price = 20;
        boolean hasPrime = false;
        String massage = "";

        if (hasPrime){
            massage = "Eligible for 2 day shipping";
        }else {
            if (price >= 25) {
                massage = "Eligible for free shipping";
            } else {
                massage = "Not eligible for free shipping.";
            }
            System.out.println(massage);
        }
    }
}
