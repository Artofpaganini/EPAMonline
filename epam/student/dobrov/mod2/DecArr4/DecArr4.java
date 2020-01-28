package by.epam.student.dobrov.mod2.DecArr4;

import java.util.Scanner;

/*
На плоскости заданы своими координатами n точек.
Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class DecArr4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите кол-во точек ");

        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        int[][] arr1 = MathDecision.randomNumbers(arr);

        MathDecision.outputArr(arr1);

        int a = MathDecision.findMaxMin(arr);
        System.out.println(a);

    }
}
//НЕ РЕШЕНА
/*
создать  массив с  н  размером
ввести рандомные числа
самое большое расстояние будет  с мин и макс элементами
найти макс и мин элементы среди столцев  , это и будут мои  Y1 Y2
Найти макс и мин  элементы среди  строк , это и будут мои элементы X1 X2
 как получить макс элементы по х??
 */