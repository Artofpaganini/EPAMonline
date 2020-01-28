package by.epam.student.dobrov.mod3.ObjString4;
/*
С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Solution {

    public static String changeString(String string) {
        StringBuilder sb = new StringBuilder();

        sb.append(string.charAt(string.indexOf("т")));
        sb.append(string.charAt(string.indexOf("о")));
        sb.append(string.charAt(string.indexOf("р")));
        sb.append(string.charAt(string.indexOf("т")));

        String word = sb.toString();
        return word;
    }
}
