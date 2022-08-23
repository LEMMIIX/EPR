package ObjectOriented;

public class RationaleZahlTest {
    public static void main(String[] args) {
        RationaleZahl rz1 = new RationaleZahl(2, 8);
        System.out.println(rz1.gibAlsText());
        RationaleZahl rz2 = new RationaleZahl(5, 6);
        System.out.println(rz1.addiere(rz2).gibAlsText());
        System.out.println(rz2.addiere(rz1).gibAlsText());
        System.out.println(new RationaleZahl(17, 4).addiere(new RationaleZahl(7, 4)).gibAlsText());
        System.out.println(new RationaleZahl(100002, 4).addiere(new RationaleZahl(5)).gibAlsText());
        System.out.println(new RationaleZahl(11, 2108303).addiere(new RationaleZahl(31, 2117009)).addiere(new RationaleZahl(47, 2134421)).gibAlsText());
        System.out.println(new RationaleZahl(3, 3037000510L).addiere(new RationaleZahl(7, 3037000500L)).gibAlsText());
        System.out.println(new RationaleZahl(10957693037L, 10967535067L).addiere(new RationaleZahl(10961461793L, 10967639796L)).gibAlsText());
    }
}
