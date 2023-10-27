package day26_methods;

public class FixFormat {
    public static String fixFormat (String str){
        return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(fixFormat("deNYs khudyna"));
    }
}
