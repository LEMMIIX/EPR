package Basic;

public class Fibonacci {
    public static long fib(int zahl) {
        return zahl <= 1
                ? zahl
                : fib(zahl - 1) + fib(zahl - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(17));
        System.out.println(fib(3));
    }
}
