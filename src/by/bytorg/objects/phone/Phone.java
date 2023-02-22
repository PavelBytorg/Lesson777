package by.bytorg.objects.phone;
/*
Классы и объекты. Телефон
Создайте класс Phone, который содержит поля number, model и weight

○  Создайте три объекта (экземпляра) этого класса.

○  Выведите в консоль значения полей объектов.

○  Добавьте в класс Phone методы:

 - receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”.

 - getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов

○  Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
Вызвать этот метод.

○  Создать метод sendMessage с входным параметром - массив номеров телефонов, которым надо отправить сообщение.
Метод выводит на консоль номера этих телефонов.
 */
public class Phone {
    private int number;
    private String model;
    private double weight;

    public Phone() {
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”.
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number){
        System.out.println("Звонит " + name + ", его номер " + number);
    }

    public void sendMessage(int[] numbers){
        for (int e: numbers) {
            System.out.print(" " + e);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
