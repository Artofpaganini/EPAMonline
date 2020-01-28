package by.epam.student.dobrov.mod4.Classes7;

import java.util.Scanner;

/*
 Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.

 */
public class Classes7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите координаты по х ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();

        System.out.println("Введите координаты по y ");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double[] triangleArr = Triangle.findSideOfTriangle(x1, x2, x3, y1, y2, y3);

        if (Triangle.isTriangleCanBe(triangleArr)) {

            for (int i = 0; i < triangleArr.length; i++) {
                System.out.println(triangleArr[i]);
            }
            System.out.println("Периметр = " + Triangle.findPerimetr(triangleArr));
            System.out.println("Площадь треугольника = " + Triangle.findSquare(triangleArr));

            double[] arrMedianIntersection = Triangle.findMedianIntersection(x1, x2, x3, y1, y2, y3);
            System.out.println("Координаты пересечения медиан = ");
            for (int i = 0; i < arrMedianIntersection.length; i++) {
                System.out.println(arrMedianIntersection[i]);
            }
        } else {
            System.out.println("Такой треугольник не может существовать ");
        }
    }
}



