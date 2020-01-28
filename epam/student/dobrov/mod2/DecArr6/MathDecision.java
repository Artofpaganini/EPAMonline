package by.epam.student.dobrov.mod2.DecArr6;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class MathDecision {

    public static boolean checkNaturalNumber(int num) {
        if (num < 0 || num % 1 != 0) {
            return false;
        }
        return true;
    }

    public static int findGcd(int num1, int num2) {
        int gcd = 0;

        if (num1 == num2) {
            return num1;
        }

        while (num1 != num2) {
            if (num1 > num2) {
                num1 -= num2;
                gcd = num1;

            } else {
                num2 -= num1;
                gcd = num2;
            }
        }
        return gcd;
    }

    public static boolean isСoprimeNumbers(int gcd) {
        if (gcd == 1) {
            return true;
        }
        return false;
    }
}

