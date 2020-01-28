package by.epam.student.dobrov.mod3.StringArr5;

import java.util.Scanner;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
 */
public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        StringBuilder sb = Solution.createArrSentence(sentence);
        System.out.println(sb.toString());
    }
}
