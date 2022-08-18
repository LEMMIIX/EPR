package Basic;

public class Zahlenspielerei {
    public static long verkette(long param1, long param2) {
        return param2 < 10
                ? param1 * 10 + param2
                : param2 % 10 + verkette(param1, param2 / 10) * 10;
    }

    public static boolean enthaelt(long param1, int ziffer) {
        return param1 < 10
                ? param1 == ziffer
                : enthaelt(param1 / 10, ziffer);
    }

    public static int anzahl(long zahl, int ziffer) {
        return zahl < 10
                ? zahl == ziffer
                    ? 1
                    : 0
                : zahl % 10 == ziffer
                    ? 1 + anzahl(zahl / 10, ziffer)
                    : anzahl(zahl / 10, ziffer);
    }

    public static long filter(long zahl, int ziffer) {
        return zahl < 10
                ? zahl == ziffer
                    ? zahl - ziffer
                    : zahl
                : zahl % 10 + filter(zahl / 10, ziffer) * 10;
    }

    public static void main(String[] args) {
        System.out.println(verkette(471,12));
        System.out.println();

        System.out.println(enthaelt(1234, 1));
        System.out.println(enthaelt(1234, 5));
        System.out.println();

        System.out.println(anzahl(111, 1));
        System.out.println(anzahl(123, 1));
        System.out.println(anzahl(123, 4));
        System.out.println();

        System.out.println(filter(123, 1));
        System.out.println(filter(123, 4));
        System.out.println();
    }
}
