package by.epam.student.dobrov.mod3.ObjString6;

/*
Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Solution {

    public static String createNewString(String string) {
        StringBuilder sb = new StringBuilder();
        String newString = string;

        for (int i = 0; i < string.length(); i++) {
            sb.append(string.charAt(i));
            for (int j = i; j < newString.length(); j++) {
                sb.append(newString.charAt(i));
                break;
            }
        }
        newString = sb.toString();
        return newString;
    }
}
