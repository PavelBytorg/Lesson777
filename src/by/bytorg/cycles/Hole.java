package by.bytorg.cycles;

import java.util.Scanner;
/*
Задача 3 Условные операторы
Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).
 */

public class Hole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите A: ");
        int a = sc.nextInt();
        System.out.print("\nВведите B: ");
        int b = sc.nextInt();
        System.out.print("\nВведите R: ");
        int r = sc.nextInt();
        // пробовал по разному вывести результат. Покажу... Тут был косячок
        getIsCovered(a, b, r);
    }

    public static void getIsCovered(int a, int b, int r){
        int radius = r*2;
        if(radius > a && radius > b){
            System.out.println("Кругляк наложился на отверстие");
        } else System.out.println("Не наложился");
    }
}
