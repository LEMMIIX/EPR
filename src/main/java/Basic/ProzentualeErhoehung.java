package Basic;

public class ProzentualeErhoehung {
    public static float erhoeheBetrag(float param1, int prozent) {
        param1 = param1 + (param1 / 100f * prozent);
        param1 = (int) (param1 * 100f + 0.5f / 100f) / 100f; //RUNDEN!

        return param1;
    }

    public static void main(String[] args) {
        System.out.println(erhoeheBetrag(50, 100)); //100
        System.out.println(erhoeheBetrag(37, 19));  //44.03
    }
}
