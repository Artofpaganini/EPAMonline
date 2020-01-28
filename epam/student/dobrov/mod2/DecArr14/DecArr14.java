package by.epam.student.dobrov.mod2.DecArr14;

import java.util.Scanner;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */
public class DecArr14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число К ");
        int k = sc.nextInt();

        showArmstrongNumber(k);
    }
    public static void showArmstrongNumber ( int k) {

        int degree = 0;
        int sum = 0;
        int digit = 0;

        for (int i = 1; i < k ; i++) {
            sum = i;
            int digitSum = 0;
            if (MathDecision.isArmstrongNumber(i)){
                System.out.println(i);
            }
        }
    }
}
