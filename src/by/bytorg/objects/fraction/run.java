package by.bytorg.objects.fraction;

public class run {
    public static void main(String[] args) {
        System.out.println(Fraction.showInfo(5, 6));
        System.out.println(Fraction.calculateFraction(6,6,2.5));
        Fraction fr1 = new Fraction(8, 4);
        System.out.println(fr1.toString());
        System.out.println("Пример с делением");
        Fraction fr2 = new Fraction(5,3);

        System.out.println(fr2.calcDiv(2.1));


    }
}
