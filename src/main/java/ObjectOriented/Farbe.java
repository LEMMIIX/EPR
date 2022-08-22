package ObjectOriented;

public class Farbe {
    private int red;
    private int green;
    private int blue;

    public Farbe(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    public Farbe gibInvertierteFarbe() {
        return new Farbe(255 - red, 255 - green, 255 - blue);
    }

    public Farbe gibNaechsteFarbe() {
        return new Farbe(
                green == 255 && blue == 255     //red
                        ? red == 255
                            ? 0
                            : red + 1
                        : red,
                blue == 255                     //green
                        ? green == 255
                            ? 0
                            : green + 1
                        : green,
                blue == 255                     //blue
                        ? 0
                        : blue + 1
        );
    }

    public String gibAlsText() {
        return new String("(" + red + ", " + green + ", " + blue + ")");
    }

    public static void main(String[] args) {
        Farbe test1 = new Farbe(255, 255, 17);

        System.out.println(test1.gibAlsText());
        System.out.println(test1.gibNaechsteFarbe().gibAlsText());
        System.out.println(test1.gibInvertierteFarbe().gibAlsText());
    }
}
