package by.epam.student.dobrov.mod2.DecArr16;

import java.util.Scanner;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class DecArr16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число N ");
        int n = sc.nextInt();

        System.out.println(MathDecision.findSumNumbers(n));
        System.out.println(MathDecision.findEvenDigits(MathDecision.findSumNumbers(n)));
    }
}

/*
  n - колво цифр  в числе
  найти сумму  чисел  в которых  есть только не четные числа

  ввести счетчик сколько  четных цифр  в найденной сумме

 */
