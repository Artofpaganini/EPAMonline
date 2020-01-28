package by.epam.student.dobrov.mod2.DecArr16;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class MathDecision {

    public static boolean checkN(int n) {

        if (n < 1) {
            return false;
        }
        return true;
    }


    public static int findCounter(int number) {

        int counter = 0;
        while (number != 0) {
            int digit = number % 10;
            counter++;
            number = number / 10;
        }
        return counter;
    }

    public static boolean checkDigitQuantity(int number, int n) {

        if (findCounter(number) == n) {
            return true;
        }
        return false;
    }

    public static boolean findOddDigits(int number) {

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    public static int findEvenDigits(int number) {
        int counter = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                counter++;
            }
            number = number / 10;
        }
        return counter;
    }

    public static int findSumNumbers(int n) {
        int i = (int) Math.pow(10, n - 1);
        int sum = 0;

        if (checkN(n)) {
            if (checkDigitQuantity(i, n)) {
                for (; i < (int) Math.pow(10, n); i++) {
                    if (findOddDigits(i)) {
                        sum += i;

                    }
                }

            }
        }
        return sum;
    }


}

/*
  n - колво цифр  в числе
  проверка на  нат число
  проверка на кол-во  цифр в числе
  метод с циклом от  минимального Н-значного числа до  максимального
        в цикле в него в передается метод который  определяет выводит только числа с нечетными  цифрами
        эти числа   суммируются
  метод который определяет сколько четных цифр в  полученной сумме

 */