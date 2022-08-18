package Basic;

public class AufsteigendeZahl {
    public static boolean istAufsteigend(int zahl) {
        return zahl < 10 || (zahl % 10 > zahl / 10 % 10 && istAufsteigend(zahl / 10));
        //      (1)
        //(1) einfachster Fall/aufsteigend, wenn Methode bis zum Ende läuft
    }
    public static void main(String[] args) {
        System.out.println(istAufsteigend(6734));
        System.out.println(istAufsteigend(1234));
        System.out.println(istAufsteigend(1144435));
    }
}
