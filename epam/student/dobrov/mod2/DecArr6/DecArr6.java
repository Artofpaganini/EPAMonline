package by.epam.student.dobrov.mod2.DecArr6;

import java.util.Scanner;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class DecArr6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число  ");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число  ");
        int num2 = sc.nextInt();

        System.out.println("Введите третье число  ");
        int num3 = sc.nextInt();


        boolean isNat1 = MathDecision.checkNaturalNumber(num1);
        boolean isNat2 = MathDecision.checkNaturalNumber(num2);
        boolean isNat3 = MathDecision.checkNaturalNumber(num3);

        if (isNat1 && isNat2 && isNat3) {
            int gcd = MathDecision.findGcd(MathDecision.findGcd(num1, num2), num3);
            System.out.println("НОД = " + gcd);

            if (MathDecision.isСoprimeNumbers(gcd)) {
                System.out.println("Числа являются взаимно простыми");
            } else {
                System.out.println("Числа НЕ являются взаимно простыми");
            }
        }else{
            System.out.println("Введено  неверное число ");
        }

    }
}
