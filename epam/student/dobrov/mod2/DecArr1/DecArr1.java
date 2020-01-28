package by.epam.student.dobrov.mod2.DecArr1;

import java.util.Scanner;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: НОК (А,Б) =  А*Б/НОД(А,Б)
 */
public class DecArr1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Введите первое значение: ");
        double number1 = sc.nextDouble();

        System.out.println("Введите второе значение: ");
        double number2 = sc.nextDouble();

        checkNaturalIntegerNumbers(number1, number2);

    }

    public static void checkNaturalIntegerNumbers(double number1, double number2) {

        if (MathDecision.checkNaturalNumber(number1, number2)) {
            if (MathDecision.isIntegerNumber(number1, number2)) {
                System.out.println("HOД " + MathDecision.isGreatestCommonDivisor(number1, number2));
                System.out.println("HOК " + MathDecision.isLeastCommonMultiple(number1, number2));
            }else{
                System.out.println("Неверный ввод числа ");
            }
        }else{
            System.out.println("Неверный ввод числа ");
        }
    }
}
