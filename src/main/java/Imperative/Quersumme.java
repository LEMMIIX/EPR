package Imperative;

public class Quersumme {
    public static int quersumme(int zahl) {
        int ergebnis = 0;

        while (zahl > 0) {
            ergebnis = ergebnis + zahl % 10;
            zahl = zahl / 10;
            System.out.println(ergebnis);
        }

        return ergebnis;
    }

    public static void main(String[] args) {
        System.out.println(quersumme(17));
        System.out.println();
        System.out.println(quersumme(987654321));
    }
}
