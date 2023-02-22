package by.bytorg.cycles;

import java.util.Scanner;

/*
Написать метод, принимающий на вход координаты двух точек и возвращающий длину отрезка между этими точками.
При тестировании координаты вводить с клавиатуры.
Подсказка: использовать класс Math и формулу расчета отрезка по координатам двух точек.
 */
public class RunSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        double rez;
        System.out.print("Введите координату А:");
        a = sc.nextInt();
        System.out.print("\nВведите координату B:");
        b = sc.nextInt();
        System.out.println("Результат: " + calculateSideC(a, b));
    }

    public static double calculateSideC(int a, int b) {
        int tmpR1 = 0;
        double rez = 0.0;
        tmpR1 = (int) (Math.pow(a, 2) + Math.pow(b, 2));
        rez = Math.sqrt(tmpR1);
        return rez;
    }

}
