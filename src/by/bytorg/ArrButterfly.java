package by.bytorg;

import java.util.Arrays;

public class ArrButterfly {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int start = 0;
        int end = arr1[0].length;
        boolean isCenter = false;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = start; j < end; j++) {
                arr1[i][j] = 1;
            }

            if (start >= arr1.length / 2)
                isCenter = true;

            if (isCenter) {
                start--;
                end++;
            } else {
                start++;
                end--;
            }
        }
        for (int[] arr : arr1) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
