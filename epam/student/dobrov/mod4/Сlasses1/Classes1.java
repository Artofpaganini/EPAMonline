package by.epam.student.dobrov.mod4.Сlasses1;

import java.util.Scanner;
/*
Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных,
и метод, который находит наибольшее значение из этих двух переменных.
 */

public class Classes1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Test1 test = new Test1(1,3);
        System.out.println(test.getNumber1());
        System.out.println(test.getNumber2());
        System.out.println(test);

        System.out.println();

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        test.setNumber1(number1);
        test.setNumber2(number2);

        System.out.println();

        System.out.println(test.sumNum());
        System.out.println(test.maxNum());
    }

}
