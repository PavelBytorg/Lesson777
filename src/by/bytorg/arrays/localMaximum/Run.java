package by.bytorg.arrays.localMaximum;

import java.util.Arrays;
import java.util.Random;

/*
1. Получить через Scanner размер тестового массива
2. Заполнить массив случайными целочисленными значениями
3. Написать метод, удаляющий из массива локальные максимумы.
4. Вывести на экран изначальный массив и массив после удаления локальных максимумов
Локальный максимум - элемент, который больше предыдущего и следующего.
Пример:
Изначальный массив: [5, 3, -10, 4, -4, 80, 20]

Поcле удаления локальных максимумов:

[3, -10, -4, 20]
 */
public class Run {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(20) - 10;
        }

        System.out.println(Arrays.toString(arr1));

    }

    public static int[] removeLocalMaximum(int[] arr) {
        //создать масс
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){

            }else if(i == arr.length-1){

            }else {

            }
        }
    }

}
