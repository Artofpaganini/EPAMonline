package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

 */
public class Array10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива ");
        int n = sc.nextInt();

        int[] arr = randomNumbers(n);
        outputArr(arr);

        System.out.println();

        squeezeArr(arr);
        outputArr(arr);

    }


    public static int[] randomNumbers(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);

        }
        return arr;
    }


    public static void findEvenIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
    }


    public static void squeezeArr(int[] arr) {
        int temp = 0;
        int currentIndex = 1;
        for (int i = 2; i < arr.length; i += 2) {
            arr[currentIndex] = arr[i];
            currentIndex++;
        }
        for (int i = currentIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }


    public static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

