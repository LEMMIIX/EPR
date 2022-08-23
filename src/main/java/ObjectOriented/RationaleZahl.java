package ObjectOriented;

public class RationaleZahl {

    private long zaehler;
    private long nenner;

    public RationaleZahl(long z) {
        this.zaehler = z;
        this.nenner = 1;
    }

    public RationaleZahl(long zaehler, long nenner) {
        this.zaehler = zaehler / greatestQuotient(zaehler, nenner);
        this.nenner = nenner / greatestQuotient(zaehler, nenner);
    }

    public RationaleZahl addiere(RationaleZahl rz) {
        long zaehler = this.zaehler * rz.nenner + rz.zaehler * this.nenner;
        long nenner = this.nenner * rz.nenner;

        return new RationaleZahl(zaehler / greatestQuotient(zaehler, nenner),
                                nenner / greatestQuotient(zaehler, nenner));
    }

    public long greatestQuotient(long m, long n) {
        return n == 0
                ? m
                : greatestQuotient(n, m % n);
    }

    public String gibAlsText() {
        return zaehler + "/" + nenner;
    }
}
