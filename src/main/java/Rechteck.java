import java.util.Arrays;

public class Rechteck {
    private int breite;
    private int hoehe;

    public Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double gibRatio() {
        return (double) breite / (double) hoehe;
    }

    public boolean groesser(Rechteck r) {
        return (breite * hoehe) > (r.breite * r.hoehe);
    }

    public Rechteck drehe90() {
        return new Rechteck(this.hoehe, this.breite);
    }

    public static boolean paaren(int[] a) {
        boolean ausPaaren = a.length % 2 == 0;

        int i = 0;
        while ((i < a.length) && ausPaaren) {
            ausPaaren = (
                    ((a[i] % 2 == 0) && (a[i + 1] % 2 == 0))
                            || ((a[i] % 2 != 0) && (a[i + 1] % 2 != 0))
                        );
            i = i + 2;
        }

        return ausPaaren;
    }

    public static int[] paarsummen(int... a) {
        int[] summe = new int[a.length - 1];

        for (int i = 0; i < a.length - 1; i++) {
            summe[i] = a[i] + a[i + 1];
        }

        return summe;
    }

    public static void scheis1() {
        int[] a = new int[]{10, 8, 6 ,5};
        int[] b = new int[3];

        a[3] = 55;
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;

        a = b;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        a[0] = 11;
        a[1] = 22;

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println(a.length);
    }

    public static int[][] dreieck(int n) {

        int[][] eck = new int[n][];
        for (int i = 0; i < n; i++) {
            eck[i] = new int[i + 1];
        }

        int zaehler = 0;
        for (int i = 0; i < eck.length; i++) {
            for (int j = 0; j < eck[i].length; j++) {
                eck[i][j] = zaehler;
                zaehler++;
            }
        }

        return eck;
    }


    public static void main(String[] args) {
        double verhaeltnis = new Rechteck(2, 1).drehe90().gibRatio();

        System.out.println(verhaeltnis);
        System.out.println();

        System.out.println(paaren(new int[]{1, 3, 6, 2, 5, 7, 11, 131}));
        System.out.println(paaren(new int[]{1, 3, 6, 2, 5, 7, 11}));
        System.out.println(paaren(new int[]{1, 3, 6, 2, 8, 0, 6, 7}));
        System.out.println();

        System.out.println(Arrays.toString(paarsummen(1, 3, -5, 7, 9, 11)));
        System.out.println();

        scheis1();
        System.out.println();

        System.out.println(Arrays.deepToString(dreieck(4)));
        System.out.println();
    }
}
