package by.epam.student.dobrov.mod2.DecArr5;

import java.util.Scanner;

/*
Составить программу, которая в массиве
A[N] находит второе по величине число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class DecArr5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива ");
        int n = sc.nextInt();

        int [] arr = MathDecision.randomNumbers(n);
        MathDecision.outputArr(arr);

        System.out.println();

        int maxFirst = MathDecision.findMax(arr);
        System.out.println("Максимальный элемент массива = " +  maxFirst);

        System.out.println();

        int maxSecond = ( MathDecision.findSecondMax(arr,maxFirst));
        System.out.println("Второй максимальный элемент массива = " + maxSecond);
    }

}
