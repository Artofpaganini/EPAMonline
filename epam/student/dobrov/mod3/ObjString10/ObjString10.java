package by.epam.student.dobrov.mod3.ObjString10;

import java.util.Scanner;

/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
Определить количество предложений в строке X.
 */
public class ObjString10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();

        int quantityOfSentences = Solution.quantityOfSentencesInText(string);

        System.out.println("Кол-во предложений = " + quantityOfSentences);

    }
}
