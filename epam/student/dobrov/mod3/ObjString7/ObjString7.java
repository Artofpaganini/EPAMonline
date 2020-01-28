package by.epam.student.dobrov.mod3.ObjString7;

import java.util.Scanner;
/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class ObjString7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        String newString = Solution.deleteRepeatingLetters(string);
        System.out.println(newString);

    }
}
