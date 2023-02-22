package by.bytorg.cycles;

import java.util.Scanner;

/*
Написать метод, который принимает на вход два целых числа, делает их
суммирование и складывает результат с произведением двух этих чисел, и
возвращает полученный результат из метода.
Передать на вход в метод любые два числа.
 */
public class Run3SummaArifm {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc1.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc1.nextInt();
        System.out.println("Резкльтат вычисления: " + getSummAndMultiplication(a, b));


    }

    public static int getSummAndMultiplication(int a, int b) {
        int resultSumm = a + b;
        int resultMultiplication = a * b;
        return resultMultiplication + resultSumm;
    }


}
