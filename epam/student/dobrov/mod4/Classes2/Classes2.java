package by.epam.student.dobrov.mod4.Classes2;

import java.util.Scanner;
/*
Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.
 */
public class Classes2 {
    public static void main(String[] args) {

        Test2 test = new Test2(1,3);
        System.out.println(test.getNumber1());
        System.out.println(test.getNumber2());

        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        test.setNumber1(number1);
        test.setNumber2(number2);
    }

}

