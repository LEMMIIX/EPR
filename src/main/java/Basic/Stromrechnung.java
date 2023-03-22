package Basic;

public class Stromrechnung {
    public static void main(String[] args) {
        int kwh = 3536; //kWh für ein Jahr

        float gPreis1 = 5.75f; //Euro pro Monat
        float gPreis2 = 9.85f;

        float vPreis1 = 23.49f; //Cent pro kWh
        float vPreis2 = 22.10f;


        gPreis1 = gPreis1 * 12 * 100;
        gPreis2 = gPreis2 * 12 * 100;

        vPreis1 = vPreis1 * kwh;
        vPreis2 = vPreis2 * kwh;

        gPreis1 = (int) (gPreis1 + vPreis1 + 0.5f);
        gPreis1 = gPreis1 / 100f;

        gPreis2 = (int) (gPreis2 + vPreis2 + 0.5f);
        gPreis2 = gPreis2 / 100f;


        //< > == <= >=
        System.out.println(gPreis1 > gPreis2
                                        ? gPreis2
                                        : gPreis1);

    }
}
