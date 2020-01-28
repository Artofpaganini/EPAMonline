package by.epam.student.dobrov.mod2;

import java.util.Scanner;

/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:
6 1 8
7 5 3
2 9 4

 */
public class DoubleArray16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("размер массива ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        magicMatrix(arr);

        outputArr(arr);
    }

    public static void outputArr(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void magicMatrix(int[][] arr) {
        int currentIndexI = 0;
        int currentIndexJ = arr.length / 2;

        int[] arrNewBuff = new int[2];
        for (int currentValue = 1; currentValue <= (int) (Math.pow(arr.length, 2)); currentValue++) {
            arr[currentIndexI][currentIndexJ] = currentValue;

            if (currentValue == (int) (Math.pow(arr.length, 2))) {
                break;
            }
            arrNewBuff = findCurrentIndex(arr, currentIndexI, currentIndexJ);
            currentIndexI = arrNewBuff[0];
            currentIndexJ = arrNewBuff[1];

        }

    }

    public static int[] findCurrentIndex(int[][] arr, int isIndexI, int isIndexJ) {
        int indexI = isIndexI - 1;
        int indexJ = isIndexJ + 1;
        int[] arrBuff = new int[2];

        if (indexI < 0 && indexJ < arr.length) {
            indexI = arr.length - 1;
            indexJ = isIndexJ + 1;
            arrBuff[0] = indexI;
            arrBuff[1] = indexJ;
        }
        if (indexI >= 0 && indexJ >= arr.length) {
            indexI = isIndexI - 1;
            indexJ = 0;
            arrBuff[0] = indexI;
            arrBuff[1] = indexJ;
        }
        if (indexI < 0 && indexJ >= arr.length) {
            indexI = isIndexI + 1;
            indexJ = isIndexJ - 1;
            arrBuff[0] = indexI;
            arrBuff[1] = indexJ;
        }
        if (arr[indexI][indexJ] != 0) {
            indexI = isIndexI + 1;
            indexJ = isIndexJ;
            arrBuff[0] = indexI;
            arrBuff[1] = indexJ;
        }
        if (arr[indexI][indexJ] == 0) {
            arrBuff[0] = indexI;
            arrBuff[1] = indexJ;
            return arrBuff;
        }
        return arrBuff;
    }
}
