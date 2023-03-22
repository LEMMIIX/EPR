package Basic;

public class Reiskoerner {
    public static void main(String[] args) {
        int r;
        int p; //prozentuale erhöhung
        int g = 0;

        r = 1;
        p = 100;


        g = g + r;
        System.out.println(r);
        r = r + r * p / 100;
        g = g + r;
        System.out.println(r);
        r = r + r * p / 100;
        g = g + r;
        System.out.println(r);
        r = r + r * p / 100;
        g = g + r;
        System.out.println(r);
        r = r + r * p / 100;
        g = g + r;
        System.out.println(r);
        r = r + r * p / 100;
        g = g + r;
        System.out.println(r);
        r = r + r * p / 100;
        g = g + r;
        System.out.println(r);
        r = r + r * p / 100;
        g = g + r;
        System.out.println(r);
        System.out.println(g);
    }
}
