package by.epam.student.dobrov.mod3.ObjString5;

/*
Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
public class Solution {

    public static  int findLetter ( String string){
        int counter = 0;

        for (int i = 0; i < string.length() ; i++) {
            if ((int) string.charAt(i) == 65 || (int)string.charAt(i) == 97){
                counter++;
            }
        }
        return counter;
    }
}
