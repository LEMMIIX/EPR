package Basic;

public class Farbe {
    public static int invertiere(int r, int g, int b) {
        int rot = 255 - r;
        int grun = 255 - g;
        int blau = 255 - b;

        return (rot * 1000 + grun) * 1000 + blau;
    }

    public static int naechsteFarbe(int r, int g, int b) {
        int rot = g == 255 && b == 255
                ? r == 255
                    ? 0
                    : r + 1
                : r;
        int grun = b == 255
                ? g == 255
                    ? 0
                    : g + 1
                : g;
        int blau = b == 255
                ? 0
                : b + 1;

        return (rot * 1000 + grun) * 1000 + blau;
    }

    public static void main(String[] args) {
        System.out.println(invertiere(000,000,000));

        System.out.println(naechsteFarbe(10,11,12));
        System.out.println(naechsteFarbe(0,255,255));
    }
}
