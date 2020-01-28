package by.epam.student.dobrov.mod3.ObjString3;

import java.util.List;
import java.util.Scanner;

/*
Проверить, является ли заданное слово палиндромом.
 */
public class ObjString3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String string = Solution.deleteSpaces(word);

        boolean isPalindrom = Solution.isPalindrom(string);
        System.out.println(isPalindrom);
    }

}
