package Basic;

public class Wurzeltest {
    public static boolean istWurzel(int param1, long param2) {
        return ((long) param1 * param1) == param2;
    }

    public static void main(String[] args) {
        System.out.println(istWurzel(12, 144));
        System.out.println(istWurzel(2, 19));
    }
}
