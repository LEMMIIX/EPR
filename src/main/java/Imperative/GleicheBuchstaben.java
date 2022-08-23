package Imperative;

public class GleicheBuchstaben {
    public static String laengsteKette(String text) {
        int left = 0;
        int right = 1;
        int leftBound = left;
        int rightBound = right;

        if(text.length() == 0 || text.length() == 1){
            return text;
        }

        for (int i = 1; i < text.length(); i++) {
            if(text.charAt(i) == text.charAt(i - 1)){
                right = right + 1;
            } else if(right - left > rightBound - leftBound) {
                leftBound = left;
                rightBound = right;

                left = i;
                right = left + 1;
            } else {
                left = i;
                right = left + 1;
            }
        }

        return (right - left > rightBound - leftBound) ? text.substring(left, right)
                : text.substring(leftBound, rightBound);
    }

    public static void main(String[] args) {
        System.out.println(laengsteKette("aaaabbbbaaadddddddd"));
        System.out.println(laengsteKette(""));
    }
}
