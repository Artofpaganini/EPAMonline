package by.epam.student.dobrov.mod3.StringArr3;

/*
В строке найти количество цифр.
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

    public static int findQuantity(String sentence) {
        String[] stringArr = createArr(sentence);
        int counter = 0;

        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < stringArr[i].length(); j++) {
                char symbol = stringArr[i].toCharArray()[j];
                if (Character.isDigit(symbol)) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

