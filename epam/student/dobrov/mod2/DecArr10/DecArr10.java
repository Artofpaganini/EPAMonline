package by.epam.student.dobrov.mod2.DecArr10;

import java.util.Scanner;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N
 */
public class DecArr10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число ");
        int number = sc.nextInt();


        if (MathDecision.isNaturalNumber(number)) {
            int arrlength = MathDecision.findArrLength(number);
            System.out.println("Длина массива = " + arrlength);

            int[] arr = MathDecision.addElements(number, arrlength);

            MathDecision.outputArr(arr);
        }else{
            System.out.println("Неверно введенное число ");
        }

    }
}
