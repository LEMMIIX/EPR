package Imperative;

public class FibonacciIterativ {
    public static long fib(int zahl) {
        int i = 3;      //Laufvariable
        int a = 1;      //cache1
        int ergebnis = 1;
        int c;          //cache2

        if (zahl > 2) {
            while (i <= zahl) {
                c = ergebnis;
                ergebnis = a + ergebnis;
                a = c;
                i++;
                }
            } else {
                ergebnis = zahl;
        }

        return ergebnis;
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(17));
    }
}
