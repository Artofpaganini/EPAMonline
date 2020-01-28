package by.epam.student.dobrov.mod2.DecArr13;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */

public class MathDecision {

    public static boolean checkNum(int num) {
        if (num <= 2 ) {
            return false;
        }
        return true;
    }

    public static int[] fillArr(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n;
            n++;
        }
        return arr;
    }

    public static boolean isNumberSimple(int n) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                counter++;
                if (counter > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int findQuantityOfPairNum(int[] arr) {
        int counterOfPairNums = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (isNumberSimple(arr[i]) && isNumberSimple(arr[i + 2])) {
                counterOfPairNums++;
            }

        }
        return counterOfPairNums;
    }

    public static int[][] fillArrBuff(int[] arr) {
        int counParNum = findQuantityOfPairNum(arr);
        int j = 0;
        int arrBuff[][] = new int[counParNum][2];

        for (int i = 0; i < arr.length - 2; i++) {
            if (isNumberSimple(arr[i]) && isNumberSimple(arr[i + 2])) {
                arrBuff [j][0]=arr[i];
                arrBuff [j][1] =arr[i+2];
                j++;
            }

        }
        return arrBuff;
    }

    public static void outputArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void outputDoubleArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }
    }
}

