package by.epam.student.dobrov.mod3.ObjString1;

import java.util.Scanner;

/*
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class ObjString1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        int maxSpaces = Solution.findMaxQuantityOfSpaces(string);

        System.out.println("Максимальное кол-во пробелов = " + maxSpaces);

    }
}

