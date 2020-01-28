package by.epam.student.dobrov.mod2.DecArr2;

import java.util.Scanner;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class DecArr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое значение: ");
        double number1 = sc.nextDouble();

        System.out.println("Введите второе значение: ");
        double number2 = sc.nextDouble();

        System.out.println("Введите третье значение: ");
        double number3 = sc.nextDouble();

        System.out.println("Введите четвертое значение: ");
        double number4 = sc.nextDouble();

        boolean isNat1 = MathDecision.checkNaturalNumber(number1);
        boolean isNat2 = MathDecision.checkNaturalNumber(number2);
        boolean isNat3 = MathDecision.checkNaturalNumber(number3);
        boolean isNat4 = MathDecision.checkNaturalNumber(number4);

        boolean isInteg1 = MathDecision.checkIntegerNumber(number1);
        boolean isInteg2 = MathDecision.checkIntegerNumber(number2);
        boolean isInteg3 = MathDecision.checkIntegerNumber(number3);
        boolean isInteg4 = MathDecision.checkIntegerNumber(number4);


        if (isNat1 && isNat2 && isNat3 && isNat4) {
            if (isInteg1 && isInteg2 && isInteg3 && isInteg4) {
                double numGcd1 = MathDecision.isGreatestCommonDivisor(number1, number2);
                double numGcd2 = MathDecision.isGreatestCommonDivisor(number3, number4);

                System.out.println("НОД 4ых чисел  = " + MathDecision.isGreatestCommonDivisor(numGcd1, numGcd2));
            } else {
                System.out.println("Неверный ввод чисел");
            }
        } else {
            System.out.println("Неверный ввод чисел");
        }
    }
}
