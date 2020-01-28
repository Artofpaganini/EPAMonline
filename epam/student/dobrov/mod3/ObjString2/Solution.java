package by.epam.student.dobrov.mod3.ObjString2;

/*
В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Solution {

    public static String addSymbolB(String sentence) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            sb.append(sentence.charAt(i));
            if ( sentence.charAt(i) == 65 || (int) sentence.charAt(i) == 97) {
                sb.append("b");
            }
        }
        String word = sb.toString();
        return word;
    }


}
