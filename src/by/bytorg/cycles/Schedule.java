package by.bytorg.cycles;

import java.util.Scanner;

/*
Задача 4 Условные операторы. Switch
Написать метод, который выводит расписание на неделю.
Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.
 */
public class Schedule {
    public static void main(String[] args) {

        System.out.print("Выберите день недели 1..7: ");
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        getWhatToDo(day);
    }

    public static void getWhatToDo(int day){
        switch (day){
            case 1:
                System.out.println("Сделать первое дело");
                break;
            case 2:
                System.out.println("Сделать второе дело");
                break;
            case 3: System.out.println("Сделать третье дело");
            case 4: System.out.println("Сделать четвертое дело");
            case 5: System.out.println("Сделать пятое дело");
            case 6: System.out.println("Сделать шестое дело");
            case 7: System.out.println("Сделать седьмое дело");
            default:{
                System.out.println("Дефолтное дело");
            }
        }
    }
}
