package by.bytorg.objects.clock;

public class Clock {
    private int alarmHours;
    private int alarmMinutes;

    public int getAlarmHours() {
        return alarmHours;
    }

    public int getAlarmMinutes() {
        return alarmMinutes;
    }

    public String setAlarm(int h, int m) {
        if (h >= 0 && h < 24) {
            alarmHours = h;
        } else {
            return "Неверный ввод часов";
        }
        if (m >= 0 && m < 60) {
            alarmMinutes = m;
        } else {
            return "Неверный ввод минут";
        }

        return "Будильник успешно установлен";
    }

    public String checkAlarm(int hours, int minutes) {
        if (hours == alarmHours && minutes == alarmMinutes) return "Звонит будильник";
        else return "Не звонит будильник";
    }

    public int getSignals(int hours, int minutes) {
        if (minutes == 0) {
            return hours > 12 ? hours - 12 : hours;
        } else if (minutes % 15 == 0){
            return 1;
        }
        return  0;
    }
}
