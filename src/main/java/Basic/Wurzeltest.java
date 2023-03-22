package Basic;

public class Wurzeltest {
    public static boolean istWurzel(int param1, long param2) {
        return ((long) param1 * param1) == param2;
    }

    public static boolean istWert(int a, int max, int min) {
        return a >= min && a <= max;
    }

    public static void main(String[] args) {
        System.out.println(istWurzel(12, 144));
        System.out.println(istWurzel(2, 19));

        System.out.println(istWert(17, 19, 5));
        System.out.println();

        int a = 2;
        int b = 4;
        int c = a;

        a = a * b;
        b = c / b;

        System.out.println(a);
        System.out.println(b);
    }
}
