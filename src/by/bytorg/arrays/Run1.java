package by.bytorg.arrays;

import java.util.Random;

public class Run1 {
    public static void main(String[] args) {
        int[] arr1 = new int[4];

        Random random = new Random();

        for (int i = 0; i < arr1.length; i++) {
//            arr1[i] = (int) (Math.random() * 20) - 10;
            arr1[i] = random.nextInt(10);
        }

        for (int s : arr1) {
            System.out.printf("%d ", s);
        }

        System.out.print("\nВывод: " + getMaxG(arr1));
        System.out.print("\nСреднее: " + getAvg(arr1));

    }

    public static int getMaxG(int[] arr) {
        int maxElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (maxElement < arr[i + 1]) {
                maxElement = arr[i + 1];
            }
        }
        return maxElement;
    }

    public static double getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }


}

