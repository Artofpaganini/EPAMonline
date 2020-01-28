package by.epam.student.dobrov.mod3.ObjString1;

import java.util.ArrayList;
import java.util.List;

/*
Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Solution {

    public static List<Integer> listOfSpaceQuantity(String sentence) {
        int counter = 0;
        List<Integer> counterList = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) {
                counter++;
            } else if (!Character.isWhitespace(sentence.charAt(i))) {

                counterList.add(counter);
                counter = 0;
            }
        }

        return counterList;
    }

    public static int findMaxQuantityOfSpaces(String sentence) {
        List<Integer> counterList = listOfSpaceQuantity(sentence);
        int max = counterList.get(0);

        for (Integer i : counterList) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
