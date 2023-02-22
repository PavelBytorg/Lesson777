package by.bytorg.cycles;

import java.util.Scanner;

/*
Задача 2 Условные операторы
Создайте    метод    с    одним    целочисленным    параметром.
Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
 */
public class CheckIsSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        System.out.println(isSeven(num));
    }

    public static boolean isSeven(int num) {
        int tmp = num % 10;
        if (tmp == 7) {
            return true;
        }
        return false;
    }
}
