package Arrays;

public class FeldRotieren {
    public static void rotiere(int[] feld, int grad) {
        int[] ergebnis = new int[feld.length];

        for (int i = 0; i < feld.length; i++) {
            ergebnis[(i + grad) % feld.length] = feld[i];
        }

        //void Methoden returnen keinen Wert!

        System.arraycopy(ergebnis, 0 , feld, 0, feld.length);
    }

    public static void main(String[] args) {
        int [] test1 = {0, 9, 5, -7, -3, 17};

        rotiere(test1, 4);

        System.out.print("Rotiertes Feld: ");
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i] + ", ");
        }
    }
}
