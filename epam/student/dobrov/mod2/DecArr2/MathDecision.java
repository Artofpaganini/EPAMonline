package by.epam.student.dobrov.mod2.DecArr2;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class MathDecision {

    public static boolean checkNaturalNumber(double number) {

        if (number < 1) {
            return false;
        }
        return true;
    }

    public static boolean checkIntegerNumber(double number) {

        if (number % 1 != 0) {
            return false;
        }
        return true;
    }

    public static double isGreatestCommonDivisor(double numberA, double numberB) {

        double gcd = 0;

        if (numberA == numberB) {
            return numberA;
        }
        while (numberA != numberB) {
            if (numberA > numberB) {
                numberA -= numberB;
                gcd = numberA;

            } else {
                numberB -= numberA;
                gcd = numberB;
            }
        }
        return gcd;
    }
}

