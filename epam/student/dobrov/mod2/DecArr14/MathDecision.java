package by.epam.student.dobrov.mod2.DecArr14;
/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */

public class MathDecision {

    public static boolean checkNum(int num) {
        if (num <= 0) {
            return false;
        }
        return true;
    }

    public static int findCounter(int number) {
        int counter = 0;

        if (checkNum(number)) {
            while (number != 0) {
                int digit = number % 10;
                counter++;
                number = number / 10;
            }

        }
        return counter;
    }

    public static boolean isArmstrongNumber(int number) {

        int sum = number;
        int digitSum = 0;
        int degree = findCounter(number);
        int numberBuff = number;

        while (numberBuff != 0) {
            int digit = numberBuff % 10;
            numberBuff = numberBuff / 10;
            digitSum += (int) Math.pow(digit, degree);
        }

        if (sum == digitSum) {
            return true;
        }
        return false;
    }
}

