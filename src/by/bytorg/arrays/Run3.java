package by.bytorg.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Run3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Создадим массив длиной....");
        System.out.print("Введите длину массива ");
        int len = scanner.nextInt();

        Run3 ob1 = new Run3();
        boolean[] arr2 = ob1.generateArr(len);

        System.out.println(Arrays.toString(arr2));
    }

    public boolean[] generateArr(int n){
        boolean[] tmpArr = new boolean[n];
        Random random = new Random();
        for (int i = 0; i < tmpArr.length; i++) {
            tmpArr[i] = random.nextBoolean();
        }
        return tmpArr;
    }



}
