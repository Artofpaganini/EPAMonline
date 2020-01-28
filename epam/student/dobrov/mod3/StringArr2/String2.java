package by.epam.student.dobrov.mod3.StringArr2;

import java.util.Scanner;

/*
Замените в строке все вхождения 'word' на 'letter'.
 */
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String[] arr = Solution.createArr(sentence);
        showArr(arr);

        System.out.println();

        String[] sentenceArr = Solution.fillArr(sentence);
        showSentence(sentenceArr);
    }

    public static void showArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void showSentence(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; ) {
            sb.append(arr[i] + " ");
            i++;
        }
        System.out.println(sb);
    }
}

