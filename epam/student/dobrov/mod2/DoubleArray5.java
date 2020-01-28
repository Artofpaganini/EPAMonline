package by.epam.student.dobrov.mod2;
/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

 1  1  1  1  1  1
 2  2  2  2  2  0
 3  3  3  3  0  0
 4  4  4  0  0  0
 5  5  0  0  0  0
 6  0  0  0  0  0
 */

public class DoubleArray5 {
    public static void main(String[] args) {

        int n = 6;
        System.out.println("Длина массива = " + n);

        int[][] arr = fillMatrix(n);
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


    public static int[][] fillMatrix(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < n - i) {
                    arr[i][j] = i + 1;
                }
            }
        }
        return arr;
    }
}
