package day06_a_arithmetic_operators;

public class house {  /*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */
    public static void main (String [] args) {

        String houseType = "Single House";
        int numOfBedroom = 5;
        int numOfBathroom = 3;
        int numOfKitchen = 2;
        boolean hasBasement = true;
        boolean isOnSale = true;
        boolean hasAttic = false;
        double price = 9_999_999.99;
String address = "123 Central Park";
int zipcode = 12321;
boolean hasPark = true;
double rating = 4.9;

String result = "the " + houseType + " on " + address + ", " + zipcode + " coasts $" + price + "\nThe " + houseType + " has " + numOfBedroom + " badrooms, has " + numOfBathroom + "  bathrooms, and has " + numOfKitchen + " kitchen. \nIt also includes a basement: " + hasBasement + ", has an attic: " + hasAttic +
        " and, has a park " + hasPark + ", is on sale: " + isOnSale + "\nThe schools in the area have a rating of: " + rating;

System.out.println(result);


    }
}
