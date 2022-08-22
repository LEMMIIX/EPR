package Imperative;

public class Palindrom {
    public static boolean istPalindrom(String text) {
        boolean pal = false;

        for (int i = 0; i < text.length() / 2 && !pal; i++) {
                pal = text.charAt(i) == text.charAt(text.length() - 1 - i);
        }

        return pal;
    }

    /** Alternative
    public static boolean istPalindrom(String text) {
        int i = 0;  //Zähler, gleichzeitig Indexstelle
        int ende = text.length() - 1; //INDEX!

        while ((i < text.length() / 2) &&
                text.charAt(i) == text.charAt(ende - i)) {
            i++;
        }

        return (i == text.length() / 2);    //ist Palindrom wenn i bis zur Hälfte von text hochgezählt wurde
    }
    */

    public static void main(String[] args) {
        System.out.println(istPalindrom("anna"));
        System.out.println(istPalindrom("obal"));
    }
}
