package by.epam.student.dobrov.mod2.DecArr8;

import java.util.Scanner;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[2] + D[3] + D[4]; D[3] +D[4] +D[5].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */

public class DecArr8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива ");
        int n = sc.nextInt();

        System.out.println("Введите начальное число  ");
        int k = sc.nextInt();

        System.out.println("Введите конечное число  ");
        int m = sc.nextInt();

        int[] arr = MathDecision.randomNumbers(n);
        MathDecision.outputArr(arr);

        System.out.println();

        int[] arrBuff = MathDecision.findSumOfThreeNum(arr, k, m);
        MathDecision.outputArr(arrBuff);

    }
}

