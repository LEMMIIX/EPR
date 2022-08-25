package Arrays;

import java.util.Arrays;

public class FelderMischen {

    /*
    public static int[] mische(int[] arr1, int[] arr2) {
        int[] endArr = new int[arr1.length + arr2.length];

        int counterArr1 = 0;
        int counterArr2 = 0;


        if (arr1.length != arr2.length) {
            endArr[endArr.length - 1] = Math.max(arr1[arr1.length - 1], arr2[arr2.length - 1]);     //Hässliche Lösung
        }

        for (int i = 0; i < endArr.length - 1; i++) {
            if (arr1[counterArr1] < arr2[counterArr2]) {
                endArr[i] = arr1[counterArr1 + 1];

                counterArr1++;
            } else {
                endArr[i] = arr2[counterArr2 + 1];

                counterArr2++;
            }
        }

        return endArr;
    }

     */

    public static int[] mische(int[] feld1, int[] feld2){
        int[] sort = new int[feld1.length + feld2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < feld1.length && j < feld2.length){
            sort[k] = feld1[i] < feld2[j]
                    ? feld1[i++]
                    : feld2[j++];
            k++;
        }

        while(i < feld1.length){
            sort[k] = feld1[i++];
            k++;
        }

        while(j < feld2.length){
            sort[k] = feld2[j++];
            k++;
        }

        return sort;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mische(new int[]{-10, -5, 0, 2, 2, 3, 7}, new int[]{-4, 0, 1, 2, 5, 6})));
        System.out.println(Arrays.toString(mische(new int[]{-10, -5, 0, 2, 2, 3}, new int[]{-4, 0, 1, 2, 5, 6})));
        System.out.println(Arrays.toString(mische(new int[]{-10, -5, 0, 2, 2, 3}, new int[]{-4, 0, 1, 2, 5, 6, 7})));
    }
}
