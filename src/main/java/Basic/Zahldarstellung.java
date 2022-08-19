package Basic;

public class Zahldarstellung {
    public static long addiere(long param1, long param2, int basis) {
        return istKompatibel(param1, basis) && istKompatibel(param2, basis)
                ? inBasis(inDez(param1, basis) + inDez(param2, basis), basis)
                : -1;
    }

    public static long inDez(long zahl, int basis) {
        return zahl < 10
                ? zahl
                : zahl % 10 + basis * inDez(zahl / 10, basis);
    }

    public static long inBasis(long zahl, int basis) {
        return zahl < basis
                ? zahl
                : zahl % basis + inBasis(zahl / basis, basis) * 10;
    }

    public static boolean istKompatibel(long zahl, int basis) {
        return zahl < 10
                ? zahl < basis
                : zahl % 10 < basis && istKompatibel(zahl / 10, basis);
    }

    public static void main(String[] args) {
        System.out.println(inDez(1101, 2));
        System.out.println(inBasis(13, 2));
        System.out.println(istKompatibel(1102, 2));
        System.out.println();

        System.out.println(addiere(1001,11,2));
        System.out.println(addiere(11011,1110,2));
        System.out.println(addiere(210,11,2));
        System.out.println(addiere(773,0,8));
        System.out.println(addiere(0,107,8));
        System.out.println(addiere(773,107,8));
        System.out.println(addiere(773,1239,8));
        System.out.println(addiere(950,192,8));
        System.out.println(addiere(9145,882,10));
        System.out.println(addiere(11111111111L,1,2));
        System.out.println(addiere(323,133,4));
    }
}
