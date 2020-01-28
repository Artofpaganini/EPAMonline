package by.epam.student.dobrov.mod2.DecArr17;

import java.util.Scanner;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class DecArr17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число ");
        int number = sc.nextInt();

        if (MathDecision.checkNumber(number)) {

            System.out.println("Кол-во действий: " + MathDecision.findQuantityOfTrying(number));
        } else {
            System.out.println("Введите натуральное число");
        }

    }

}