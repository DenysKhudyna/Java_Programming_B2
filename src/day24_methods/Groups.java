package day24_methods;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] groups = new String [4][];

        // String [][] group2 = new String [4][3];
        System.out.println("Adding group 1 ....");
        String [] group1 = {"Gular", "Maya", "Ulvi"};
        groups[0] = group1;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 2 ....");
        String [] group2 = {"Iryna", "Ayataj", "Elturk", "Anna"};
        groups[1] = group2;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 3 ....");
        String [] group3 = {"Ramiz", "Natalia"};
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("Adding group 4 ....");
        String [] group4 = {"Ulvi"};
        groups[3] = group4;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("-------------------------");
        for ( String [] eachElem : groups) {
            System.out.println(Arrays.toString(eachElem));
        }
        System.out.println("-------------------------");
        for ( String [] eachArray : groups) {
            for (String eachName : eachArray ){
                System.out.println(eachName);
            }
        }

    }
}
