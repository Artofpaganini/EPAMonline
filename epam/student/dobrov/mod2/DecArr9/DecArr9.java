package by.epam.student.dobrov.mod2.DecArr9;
/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */

import java.util.Scanner;

public class DecArr9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа  x,y,z,t");

        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = sc.nextInt();
        double t = sc.nextInt();

        boolean a = MathDecision.checkNumber(x);
        boolean b = MathDecision.checkNumber(y);
        boolean c = MathDecision.checkNumber(z);
        boolean d = MathDecision.checkNumber(t);

        double hypo = MathDecision.findHypotenuse(x,y);
        double halfPerimetr1 = MathDecision.findHalfPerimetr(x,y,hypo);
        double halfPerimetr2 = MathDecision.findHalfPerimetr(z,t,hypo);


        if (a && b && c && d) {
            double sMain = MathDecision.findTriagleSquare(x,y,hypo,halfPerimetr1) + MathDecision.findTriagleSquare(z,t,hypo,halfPerimetr2);
            System.out.println("Площадь произвольного четырехугольника = " + sMain);
        } else {
            System.out.println("Введите корректное  число");
        }
    }
}