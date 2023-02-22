package by.bytorg.cycles;

import java.util.Scanner;

public class RunDigitSumm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int digit = scanner.nextInt();
        System.out.println(calculate(digit));
    }

    public static int calculate(int digit){
        String str = Integer.toString(digit);
        int summa = 0;
        if(str.length() == 4){
            int rLeft = digit/100;
            int rRight = digit%100;
            summa = rLeft + rRight;
        }else {
            System.out.println("не то");
        }
        return summa;
    }
}
