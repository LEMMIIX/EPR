package Arrays;

import java.util.Arrays;

public class MatrixDreieck {
    public static int[][] dreieck(int x) {
        int[][] dreieckMatrix = new int[x][];

        int k = 0;
        for (int i = 0; i < x; i++) {
            dreieckMatrix[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {
                dreieckMatrix[i][j] = k;
                k++;
            }
        }

        return dreieckMatrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(dreieck(5)));
    }
}
