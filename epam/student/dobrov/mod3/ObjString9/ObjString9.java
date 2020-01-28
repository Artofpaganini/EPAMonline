package by.epam.student.dobrov.mod3.ObjString9;

import java.util.Scanner;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
 */
public class ObjString9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        int upper = Solution.upperCaseQuantity(string);
        int lower = Solution.lowerCaseQuantity(string);

        System.out.println("В строке " + upper + " большие(х) букв");
        System.out.println("В строке " + lower + " маленькие(х) букв");

    }
}
