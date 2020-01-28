package by.epam.student.dobrov.mod2.DecArr15;

import java.util.Scanner;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
 Для решения задачи использовать декомпозицию.
 */
public class DecArr15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число N ");
        int n = sc.nextInt();

        showArr(n);
    }

    public static void showArr(int n) {

        if (MathDecision.checkN(n)) {
            int arr[] = MathDecision.findElementsOfNewArr(n);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}

