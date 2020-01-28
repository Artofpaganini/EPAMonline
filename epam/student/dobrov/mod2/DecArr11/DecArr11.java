package by.epam.student.dobrov.mod2.DecArr11;

import java.util.Scanner;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class DecArr11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число ");
        int number1 = sc.nextInt();

        System.out.println("Введите второе число ");
        int number2 = sc.nextInt();

        int counter1 = MathDecision.findArrLength(number1);
        System.out.println("Кол-во цифр  первого числа = " + counter1);

        int counter2 = MathDecision.findArrLength(number2);
        System.out.println("Кол-во цифр  первого числа = " + counter2);

        MathDecision.determineWhichNum(counter1,counter2);
    }
}

