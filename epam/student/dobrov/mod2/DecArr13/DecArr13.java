package by.epam.student.dobrov.mod2.DecArr13;

import java.util.Scanner;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */
public class DecArr13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = sc.nextInt();

        if (MathDecision.checkNum(n)) {

            int[] arr = MathDecision.fillArr(n);
            MathDecision.outputArr(arr);
            System.out.println();
            int[][] arrNew = MathDecision.fillArrBuff(arr);
            MathDecision.outputDoubleArr(arrNew);

        }else{
            System.out.println("Неверное число");
        }
    }
}
