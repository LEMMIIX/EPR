package Arrays;

public class MatrixDrehen {
    public static char[][] dreheRechts(char[][] matrix) {
        char[][] gedreht = new char[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                gedreht[i][j] = matrix[matrix.length - j - 1][i];
            }
        }

        return gedreht;
    }

    public static void ausgeben(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[][] test1 = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'}
                /* soll:
                 * {'7', '4', '1'},
                 * {'8', '5', '2'},
                 * {'9', '6', '3'}
                */
        };
        ausgeben(test1);
        ausgeben(dreheRechts(test1));
    }
}
