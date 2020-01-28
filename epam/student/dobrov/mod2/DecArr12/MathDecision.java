package by.epam.student.dobrov.mod2.DecArr12;

/*
Даны натуральные числа К и N.
Написать метод(методы) формирования массива А, элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class MathDecision {

    public static boolean isNaturalNumber(int number) {
        if (number <= 0 || number % 1 != 0) {
            return false;

        }
        return true;
    }

    public static int findLengthOfNewArr(int k, int n) {
        int counter = 0;
        int sum = 0;

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) {
                sum = i + j;
                if (sum == k) {
                    counter++;
                }
            }
        }

        return counter;
    }

    public static int[] fillArr(int k, int n, int counter) {
        int sum = 0;
        int[] arr = new int[counter];

        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr.length; j++) {
                sum = i + j;
                if (sum == k) {
                    if (sum <= n) {
                        sum = i * 10 + j;
                        arr[i] = sum;
                    }
                }
            }
        }
        return arr;
    }

    public static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


// ПЕРЕДЕЛАТЬ ПРОВЕРКУ НА НАТ ЧИСЛО И ВЫЗОВ ЭКСЕПШН