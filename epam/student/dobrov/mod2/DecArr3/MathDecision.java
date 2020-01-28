package by.epam.student.dobrov.mod2.DecArr3;

public class MathDecision {

    public static boolean checkNaturalNumber(double num) {
        if (num > 0) {
            return true;
        }
        return false;
    }

    public static double getTriagleSquare(double num) {

        double triangleS = 0;
        return triangleS = (Math.sqrt(3) / 4) * Math.pow(num, 2);

    }

    public static void getHexagonSquare(double triangleS) {
        double hexagonSquare = triangleS * 6;
        System.out.println(hexagonSquare);
    }


}
