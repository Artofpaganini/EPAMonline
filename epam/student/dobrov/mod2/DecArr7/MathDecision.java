package by.epam.student.dobrov.mod2.DecArr7;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class MathDecision {

    public static int findSumFactorialOddNumbers() {

        int factorialSum = 0;

        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                int factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial = factorial * j;
                }
                factorialSum += factorial;
            }

        }
        return factorialSum;
    }

}
