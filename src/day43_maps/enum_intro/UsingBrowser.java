package day43_maps.enum_intro;

public class UsingBrowser {

    public static void main(String[] args) {


        Browser browser = Browser.EDGE;

        switch (browser) {

            case EDGE:
                System.out.println("Opening EDGE");
                break;
            case CHROME:
            case SAFARI:
                System.out.println("Openig CHROME or SAFARI");
        }





    }

}
