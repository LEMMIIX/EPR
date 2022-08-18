package Basic;

public class Zahldarstellung {
    public static long addiere(long param1, long param2, int basis) {

    }

    public static long inDez(long zahl, int basis) {
        return zahl < 10
                ? zahl
                : zahl % 10 + basis * inDez(zahl / 10, basis);
    }

    public static long inBasis(long zahl, int basis) {

    }

    public static boolean istKompatibel(long zahl, int basis) {

    }

    public static void main(String[] args) {

    }
}
