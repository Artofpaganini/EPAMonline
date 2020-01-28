package by.epam.student.dobrov.mod4.Classes7;

/*
 Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */
public class Triangle {


    public static double[] findSideOfTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {

        double[] sideArr = new double[3];
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));

        sideArr[0] = a;
        sideArr[1] = b;
        sideArr[2] = c;

        return sideArr;
    }

    public static boolean isTriangleCanBe(double[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] + arr[1] <= arr[2] || arr[0] + arr[2] <= arr[1] || arr[1] + arr[2] <= arr[0])
                return false;
        }
        return true;
    }

    public static double findPerimetr(double[] arr) {

        double perimetr = 0;
        for (int i = 0; i < arr.length; i++) {
            perimetr += arr[i];
        }
        return perimetr;
    }

    public static double findHalfPerimetr(double[] arr) {

        double hp = 0;
        for (int i = 0; i < arr.length; i++) {
            hp += arr[i];

        }
        hp = hp / 2;
        return hp;
    }

    public static double findSquare(double[] arr) {
        double hp = findHalfPerimetr(arr);
        double square = Math.sqrt(hp * (hp - arr[0]) * (hp - arr[1]) * (hp - arr[2]));

        return square;
    }

    public static double[] findMedianIntersection(double x1, double x2, double x3, double y1, double y2, double y3) {

        double[] arrMedianIntersection = new double[2];

        arrMedianIntersection[0] = (x1 + x2 + x3) / 3;
        arrMedianIntersection[1] = (y1 + y2 + y3) / 3;

        return arrMedianIntersection;
    }
}




