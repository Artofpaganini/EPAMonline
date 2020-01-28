package by.epam.student.dobrov.mod3.StringArr5;


import java.util.StringJoiner;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.
 */
public class Solution {


    public static String deleteSpace(String sentence) {
        return sentence = sentence.trim();
    }

    public static int lengthStringArr(String sentence) {
        int counter = 0;

        for (String i : deleteSpace(sentence).split(" ")) {
            counter++;
        }
        return counter;
    }

    public static String[] createArr(String sentence) {
        String[] stringArr = new String[lengthStringArr(sentence)];

        for (int i = 0; i < stringArr.length; i++) {
            stringArr = sentence.split(" ");
        }
        return stringArr;
    }

    public static int lengthOfNewStringArr(String sentence) {

        int counter = 0;
        for (int i = 0; i < createArr(sentence).length; i++) {
            if (!createArr(sentence)[i].isEmpty()) {
                counter++;

            }
        }
        return counter;
    }

    public static String[] createSentenceWithoutSpaces(String sentence) {

        String[] newArr = new String[lengthOfNewStringArr(sentence)];

        for (int i = 0; i < newArr.length; ) {
            for (int j = 0; j < createArr(sentence).length; j++) {
                if (!createArr(sentence)[j].isEmpty()) {
                    newArr[i] = createArr(sentence)[j];
                    i++;
                }
            }
        }
        return newArr;
    }

    public static StringBuilder createArrSentence(String sentence) {

        String[] newArr = createSentenceWithoutSpaces(sentence);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < newArr.length; i++) {
            sb.append(newArr[i]);
            sb.append(" ");
        }
        return sb;
    }
}

