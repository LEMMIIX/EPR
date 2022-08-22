package Imperative;

public class AbsteigendeZahl {
    public static boolean istAbsteigend(int zahl) {
        boolean abs = false;

        while (zahl > 0 && !abs) {
            abs = zahl % 10 < zahl / 10 % 10;
            zahl = zahl / 10;
        }

        return abs;
    }

    public static void main(String[] args) {
        System.out.println(istAbsteigend(12345));
        System.out.println(istAbsteigend(54321));
    }
}
