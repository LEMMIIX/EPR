package Basic;

public class Binaerdarstellung {
    public static int binaerWert(long binaerdarstelllung) {
        return (int) (binaerdarstelllung < 10
                    ? binaerdarstelllung
                    : binaerdarstelllung % 10 + 2 * binaerWert(binaerdarstelllung / 10));
    }

    public static void main(String[] args) {
        System.out.println(binaerWert(1101));
    }
}
