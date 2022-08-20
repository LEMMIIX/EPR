package Basic;

/**
 * Heron Verfahren zur näherungsweisen Bestimmung einer Quadratwurzel
 * <a href="https://www.youtube.com/watch?v=-wEJzyHB5us">https://www.youtube.com/watch?v=-wEJzyHB5us</a>
 */
public class Wurzelberechnen {
    public static double wurzel(double x, double epsilon) {
        return wurzel(x, 1, x, epsilon);
    }

    public static double wurzel(double a, double b, double flaeche, double epsilon) {
        return a - b < epsilon
                ? a
                : wurzel((a + b) / 2, flaeche / ((a + b) / 2), flaeche, epsilon);
    }

    public static void main(String[] args) {
        System.out.println(wurzel(3,0.01));
        System.out.println(wurzel(17,0.01));
        System.out.println(wurzel(9, 0.01));
    }
}
