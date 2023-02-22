package by.bytorg.objects.fraction;
/*
  Создайте класс, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
○    Конструктор класса должен инициализировать эти два поля.
○    Создайте метод класса, который будет выводить дробь в текстовой строке в формате x / y;
○    Создайте метод, умножающий текущую дробь на число типа double, переданное методу в параметре и возвращающий дробь - результат умножения;
○    Создайте метод, делящий текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.
 */

public class Fraction {
    private int numerator;
    private int deNominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDeNominator() {
        return deNominator;
    }

    public Fraction() {
    }

    public Fraction(int numerator, int deNominator) {
        this.numerator = numerator;
        this.deNominator = deNominator;
    }

    public static String showInfo(int n, int d){
        return n +"/" + d;
    }

    @Override
    public String toString() {
        return "Дробь: " + numerator + "/" + deNominator;
    }

    //  Создайте метод, умножающий текущую дробь на число типа double,
    //  переданное методу в параметре и возвращающий дробь - результат умножения;
    //  Не понимаю, что зн, текущую? У нас же два инта числ и знам...
    public static String calculateFraction(int n, int d, double num){
        double resFirst = (double) n / d;
        double resLast = resFirst * num;
        return "" + resLast;    //это мы преобразовали в строку наш дабловский резудьтат
                                // как тут заретурнить в формате %.2f ?
    }

    // Меня смущает фраза "текущую дробь".
    //Тут я забадался. Была мысль принимать Fraction. Но что-то не то
    public String calcDiv(double n){
        double resFirst = getNumerator()/getDeNominator();
        return "" + (resFirst * n);
    }
}
