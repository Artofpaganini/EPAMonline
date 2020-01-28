package by.epam.student.dobrov.mod3.ObjString8;

/*
Вводится строка слов, разделенных пробелами.
Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
public class Solution {

    public static String maxCounterWord(String sentence) {
        int counter = 0;
        int maxCounter = 0;
        StringBuilder sb = new StringBuilder();
        String stringMax = null;

        for (int i = 0; i < sentence.length(); i++) {

            if (!Character.isWhitespace(sentence.charAt(i))) {
                counter++;
                sb.append(sentence.charAt(i));
            } else if (Character.isWhitespace(sentence.charAt(i))) {
                if (counter > maxCounter) {
                    maxCounter = counter;
                    stringMax = sb.toString();
                }
                counter = 0;
                sb.setLength(0);
            }
        }
        return stringMax;
    }

}
/*
 хранить  индекс первого вхождения ,  есть  индекс и  длина слова , мы можем его вырезать
 */