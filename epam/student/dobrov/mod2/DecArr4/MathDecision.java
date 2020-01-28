package by.epam.student.dobrov.mod2.DecArr4;

public class MathDecision {


    public static void outputArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] randomNumbers(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = (int) (Math.random() * (10 - (-10) + (-10)));
            }


        }
        return arr;
    }

    public static int findMaxMin(int[][] arr) {

        int max = 0;
        int min = 0;
        for (int i = 0; i < 2; i++) {
            max = arr[0][0];
            min = arr[0][0];
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }

        }

        return max;
    }
}


/*
 создать  массив с  н  размером
 ввести рандомные числа
 самое большое расстояние будет  с мин и макс элементами
найти макс и мин элементы среди столцев  , это и будут мои  Y1 Y2
Найти макс и мин  элементы среди  строк , это и будут мои элементы X1 X2
 как получить макс элементы по х??
 */