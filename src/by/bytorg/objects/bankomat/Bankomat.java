package by.bytorg.objects.bankomat;

import java.util.Arrays;

/*
Набор купюр, находящихся в банкомате, должен задаваться свойствами: количеством купюр номиналом 20, 50, 100.
Сделать методы для добавления денег в банкомат.
Сделать метод, снимающий  деньги.
С клавиатуры передается сумма денег. На экран выводим операция удалась или нет.
 */
public class Bankomat {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    public Bankomat() {
        banknote20 = 0;
        banknote50 = 0;
        banknote100 = 0;
    }

    public Bankomat(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public int getBanknote20() {
        return banknote20;
    }

    public void setBanknote20(int banknote20) {
        this.banknote20 = banknote20;
    }

    public int getBanknote50() {
        return banknote50;
    }

    public void setBanknote50(int banknote50) {
        this.banknote50 = banknote50;
    }

    public int getBanknote100() {
        return banknote100;
    }

    public void setBanknote100(int banknote100) {
        this.banknote100 = banknote100;
    }

    public void addBanknotes(int b20, int b50, int b100){
        banknote20 += b20;
        banknote50 += b50;
        banknote100 += b100;
    }

    @Override
    public String toString() {
        return "В банкомате: "   + banknote20 + " двадцаток; " +
                                 + banknote50 + " писяток; " +
                                 + banknote100 + " соток;";
    }
}
