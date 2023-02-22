package by.bytorg.objects.phone;

import java.util.Random;
import java.util.Scanner;

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
public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Phone ph1 = new Phone(1, "Nokia", 22.2);
        Phone ph2 = new Phone(5, "LG", 56.4);
        Phone ph3 = new Phone(7, "Siemens", 14.8);

        System.out.println(ph1.toString());
        System.out.println(ph2.getModel());
        ph3.setWeight(33.3);
        System.out.println(ph3.getWeight());

        System.out.print("Введите имя звонящего ");
        String name = scanner.nextLine();
        System.out.print("Введите номер звонящего ");
        int number = scanner.nextInt();

        ph1.receiveCall(name);
        ph2.receiveCall(name, number);

        Random rnd1 = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd1.nextInt(50) + 50;
        }

        ph3.sendMessage(numbers);
    }
}
