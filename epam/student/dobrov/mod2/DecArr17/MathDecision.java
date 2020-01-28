package by.epam.student.dobrov.mod2.DecArr17;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class MathDecision {

    public static boolean checkNumber(int number) {

        if (number < 1) {
            return false;
        }
        return true;
    }

    public static int findSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        return sum;
    }

    public static int findQuantityOfTrying(int number) {
        int counter = 0;

        while (number != 0) {
            number = number - findSumOfDigits(number);
            counter++;
        }
        return counter;
    }
}