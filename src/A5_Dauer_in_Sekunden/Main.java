package A5_Dauer_in_Sekunden;

public class Main {

    public static void main(String[] args) {
        System.out.println(lesbareDauer(60));
        System.out.println(lesbareDauer(12345));
    }

    private static String lesbareDauer(int i) {
        int h = i/3600;
        int m = (i%3600)/60;
        int s = i%60;
        return h + "h " + m + "m " + s + "s ";
    }

    /*
    // alte Lösung
    private static String lesbareDauer(int dauerInSekunden) {
        int h = dauerInSekunden / 3600; //Menge der Stunden
        dauerInSekunden = dauerInSekunden - h*3600; //
        int m = dauerInSekunden / 60;
        dauerInSekunden = dauerInSekunden - m*60;
        int s = dauerInSekunden;
        return (h + "h " + m + "m " + s + "s");
    }
    */
}
