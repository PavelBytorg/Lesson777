package by.bytorg.objects.bankomat;

public class Run {
    public static void main(String[] args) {
        Bankomat bankomatNull = new Bankomat();
        System.out.println(bankomatNull.toString());

        bankomatNull.addBanknotes(0, 5, 20);
        System.out.println(bankomatNull);

    }
}
