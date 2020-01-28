package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента  ai и ai+1 . Если ai <= ai+1 , то продвигаются
на один элемент вперед. Если ai >= ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class SortArray6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = sc.nextInt();

        int arr[] = randomNumbers(n);
        outputArr(arr);

        System.out.println();

        sort(arr);
        outputArr(arr);

    }

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

    public static void sort(int[] arr) {
        for (int i = arr.length / 2; i >= 1; i /= 2) {
            for (int j = 0; j < i; j++) {
                sortProcess(arr, i, j);
            }
        }
    }

    public static void sortProcess(int[] arr, int i1, int j1) {
        int temp = 0;

        for (int i = j1; i < arr.length - 1; i += i1) {
            for (int j = Math.min(i + i1, arr.length - 1); j - i1 >= 0; j = j - i1) {
                if (arr[j - i1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - i1];
                    arr[j - i1] = temp;
                }
            }
        }
    }
}
