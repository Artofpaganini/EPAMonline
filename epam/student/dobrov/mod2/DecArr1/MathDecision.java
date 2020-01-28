package by.epam.student.dobrov.mod2.DecArr1;

public class MathDecision {

    public static boolean isIntegerNumber(double number1, double number2) {

        if (number1 % 1 != 0 || number2 % 1 != 0) {
            return false;
        }
        return true;
    }

    public static boolean checkNaturalNumber(double number1, double number2)  {

        if (number1 < 1 || number2 < 1 ) {
           return false;
        }
        return true;
    }

    public static double isGreatestCommonDivisor(double number1, double number2) {

        double gcd = 0;

        if (number1 == number2) {
            return number1;
        }

        while (number1 != number2) {

            if (number1 > number2) {
                number1 -= number2;
                gcd = number1;

            } else {
                number2 -= number1;
                gcd = number2;

            }
        }
        return gcd;
    }

    public static double isLeastCommonMultiple(double number1, double number2) {

        double result = 0;
        return  result = number1 * number2 / isGreatestCommonDivisor(number1, number2);
    }
}
