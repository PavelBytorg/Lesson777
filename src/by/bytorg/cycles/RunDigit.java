package by.bytorg.cycles;

import java.util.Scanner;

public class RunDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int mainDigit = scanner.nextInt();
        System.out.println(getThirdNumber(mainDigit));
    }

    public static int getThirdNumber(int mainDigit) {
        String str = Integer.toString(mainDigit);
        int r2 = 0;
        if (str.length() == 5) {
            int r1 = mainDigit / 100;
            r2 = r1 % 10;
        } else {
            System.out.println("Не то");
        }
        return r2;
    }
}
