package by.epam.student.dobrov.mod3.ObjString6;

import java.util.Scanner;

/*
Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class ObjString6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        String newString = Solution.createNewString(string);

        System.out.println(newString);

    }
}
