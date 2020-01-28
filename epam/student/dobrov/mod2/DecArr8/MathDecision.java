package by.epam.student.dobrov.mod2.DecArr8;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[5] +D[6] +D[7].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 */
public class MathDecision {

    public static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] randomNumbers(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);

        }
        return arr;
    }


    public static int findSum(int[] arr, int k) {
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += arr[k];
            k++;
        }
        return sum;
    }

    public static int[] findSumOfThreeNum(int arr[], int k, int m) {

        int arrBuffLength = (m - k) / 2;
        int arrBuff[] = new int[arrBuffLength];

        for (int i = 0; i < arrBuff.length; i++) {
            arrBuff[i] = findSum(arr, k);
            k += 2;
        }

        return arrBuff;
    }
}


