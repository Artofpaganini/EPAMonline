package by.epam.student.dobrov.mod2.DecArr12;

import java.util.Scanner;

/*
Даны натуральные числа К и N.
Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class DecArr12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число К ");
        int k = sc.nextInt();

        System.out.println("Введите число N ");
        int n = sc.nextInt();

        boolean isNatK = MathDecision.isNaturalNumber(k);
        boolean isNatN = MathDecision.isNaturalNumber(n);

        if ( isNatK && isNatN) {
            int counter = MathDecision.findLengthOfNewArr(k,n);
            System.out.println("Длина массива = " + counter);

            int []arr = MathDecision.fillArr(k,n,counter);

            MathDecision.outputArr(arr);
        }else{
            System.out.println("Неверное введенное число");
        }

    }
}
