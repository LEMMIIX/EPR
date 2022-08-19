package Basic;

public class VerschiedeneZiffern {
    public static int filter(int zahl, int ziffer) {

        return (zahl < 10) ? zahl == ziffer ? 0
                : zahl
                : zahl % 10 != ziffer ? zahl % 10 + 10 * filter(zahl / 10, ziffer)
                : filter(zahl / 10, ziffer);
    }

    public static boolean enthaelt(long zahl, int ziffer) {

        return (zahl < 10)
                ? zahl == ziffer
                : zahl % 10 == ziffer || enthaelt(zahl / 10, ziffer);
    }

    public static int anzahlZiffern(int zahl, int ziffer){
        return ziffer > 9 ? 0
                : enthaelt(zahl, ziffer) ? 1 + anzahlZiffern(filter(zahl, ziffer), ++ziffer)
                : anzahlZiffern(filter(zahl, ziffer), ++ziffer);
    }

    public static int anzahlZiffern(int zahl){
        return anzahlZiffern(zahl, 0);
    }

    public static void main(String[] args) {
        System.out.println(anzahlZiffern(12345));       //5
        System.out.println(anzahlZiffern(11464234));    //5
        System.out.println(anzahlZiffern(1));           //1
        System.out.println(anzahlZiffern(111));         //1
        System.out.println(anzahlZiffern(986986));      //3
        System.out.println(anzahlZiffern(0));           //1
        System.out.println(anzahlZiffern(11001210));    //3
    }
}