package by.epam.student.dobrov.mod3.ObjString8;

import java.util.Scanner;

/*
Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
public class ObjString8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String newSentence = Solution.maxCounterWord(sentence);
        System.out.println(newSentence);

    }
}
