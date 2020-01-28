package by.epam.student.dobrov.mod2.DecArr5;

/*
Составить программу, которая в массиве
A[N] находит второе по величине число (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class MathDecision {

    public static int[] randomNumbers(int n) {

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);

        }
        return arr;
    }

    public static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int findMax(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        return max;
    }

    public static int findSecondMax(int[] arr, int max) {

        int maxSecond = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxSecond < arr[i] && arr[i] < max) {
                maxSecond = arr[i];
                if (arr[i] == max) {
                    break;
                }
            }
        }
        return maxSecond;
    }
}
