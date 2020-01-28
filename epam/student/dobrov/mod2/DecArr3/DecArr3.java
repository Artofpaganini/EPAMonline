package by.epam.student.dobrov.mod2.DecArr3;

import java.util.Scanner;

/*
Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
public class DecArr3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Сторона правильного шестиугольника = ") ;

        double side = sc.nextInt();

        if (MathDecision.checkNaturalNumber(side)) {
            double squareTriagle = MathDecision.getTriagleSquare(side);
            MathDecision.getHexagonSquare(squareTriagle);
        }else{
            System.out.println("Неверно введенное число  ");
        }
    }
}
