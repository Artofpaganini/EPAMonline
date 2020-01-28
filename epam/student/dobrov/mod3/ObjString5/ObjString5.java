package by.epam.student.dobrov.mod3.ObjString5;

import java.util.Scanner;

/*
Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class ObjString5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        int counter = Solution.findLetter(string);
        System.out.println("Кол-во  символа 'а(А)'  в строке: " + counter);
    }
}
