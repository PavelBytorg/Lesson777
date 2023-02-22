package by.bytorg.cycles;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Склько человек едят? Введите:");
        int peopleCount = sc.nextInt();
        System.out.println();
        System.out.print("Сколько кусков у пиццы? Введите:");
        int pizzaCount = sc.nextInt();

        int rez = calculatePizzes(pizzaCount, peopleCount);

        System.out.println("Результат: " + rez + " пицц");

    }

    public static int calculatePizzes(int pz, int pl) {
        int countPizz = 1;
        while ((pz * countPizz) % pl != 0) {
            countPizz++;
        }
        return countPizz;
    }
}
