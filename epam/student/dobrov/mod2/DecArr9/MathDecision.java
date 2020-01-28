package by.epam.student.dobrov.mod2.DecArr9;

/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class MathDecision {
    public static boolean checkNumber(double number) {

        if (number < 1) {
            return false;
        }
        return true;
    }

    public static double findHypotenuse(double num1, double num2) {

        double hypo = 0;
        return hypo = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
    }

    public static double findHalfPerimetr(double num1, double num2,double hypo) {

        double halfPerimetr = (num1 + num2 + hypo ) / 2;

        return halfPerimetr;
    }


    public static double findTriagleSquare(double num1, double num2,double hypo,double hp) {
        double s = 0;

        return s = Math.sqrt(hp* (hp - num1) * (hp-num2) *( hp -  hypo));


    }
}
