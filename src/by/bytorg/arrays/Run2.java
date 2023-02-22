package by.bytorg.arrays;

import java.util.Random;
import java.util.Scanner;

public class Run2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Random rand1 = new Random();
        System.out.print("Введите размерность массива: ");
        int dimension = sc1.nextInt();
        int[] arr1 = new int[dimension];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand1.nextInt(10);
        }
        System.out.println("Получили массив:");
        for (int e : arr1) {
            System.out.print(" " +  (rand1.nextInt(20)-10));
        }

    }


}
