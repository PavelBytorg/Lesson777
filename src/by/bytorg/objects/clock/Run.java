package by.bytorg.objects.clock;

import java.util.Random;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Random randomTime = new Random(); // рандомно записывать часы и минуты
        String rez1 = clock.setAlarm(15, 00); //String rez1 = clock.setAlarm(randomTime.nextInt(24), 00);
        System.out.println("В будильник записались часы " + clock.getAlarmHours() +
                                            " и минуты " + clock.getAlarmMinutes() +
                                                ". и " + rez1);

        String rez2 = clock.checkAlarm(14, 00);
        System.out.println(rez2);

        int rez3 = clock.getSignals(15, 0);
        System.out.println(rez3);


    }
}
