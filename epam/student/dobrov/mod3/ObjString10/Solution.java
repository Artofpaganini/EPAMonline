package by.epam.student.dobrov.mod3.ObjString10;

/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным знаком.
 Определить количество предложений в строке X.
 */
public class Solution {
    public static int quantityOfSentencesInText(String string) {
        int counter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.' || string.charAt(i) == '!' || string.charAt(i) == '?') {
                counter++;
            }
        }
        return counter;
    }
}
