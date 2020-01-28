package by.epam.student.dobrov.mod3.ObjString7;
/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class Solution {

    public static String deleteAllSpaces(String string) {
        string = string.trim();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i)) == false) {
                sb.append(string.charAt(i));
            }
        }
        string = sb.toString();
        return string;
    }

    public static String deleteRepeatingLetters(String string) {
        String newString = deleteAllSpaces(string);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < newString.length(); i++) {
            if (newString.indexOf(newString.charAt(i)) == i) {
                sb.append(newString.charAt(i));
            } else {
                continue;
            }
        }
        newString = sb.toString();
        return newString;
    }
}
