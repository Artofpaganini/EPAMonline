package by.epam.student.dobrov.mod3.StringArr2;
/*
Замените в строке все вхождения 'word' на 'letter'.
 */
public class Solution {

    public static int quantityOfStringArr(String sentence) {
        int counter = 0;

        for (String i : sentence.split(" ")) {
            counter++;
        }
        return counter;
    }

    public static String[] createArr(String sentence) {
        String[] stringArr = new String[quantityOfStringArr(sentence)];

        for (int i = 0; i < stringArr.length; i++) {
            stringArr = sentence.split(" ");
        }
        return stringArr;
    }

    public static String[] fillArr(String sentence) {
        String[] stringArr = createArr(sentence);

        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals("word")) {
                stringArr[i] = "letter";
            }
        }
        return stringArr;
    }
}
