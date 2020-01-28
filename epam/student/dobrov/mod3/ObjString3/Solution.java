package by.epam.student.dobrov.mod3.ObjString3;

import java.util.ArrayList;
import java.util.List;

/*
Проверить, является ли заданное слово палиндромом.
 */
public class Solution {

    public static String deleteSpaces(String word) {
        return word = word.trim();
    }

    public static List<Character> createFistArrPalindrom(String word) {

        List<Character> firstArrWord = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            firstArrWord.add(word.charAt(i));
        }
        return firstArrWord;
    }

    public static List<Character> createSecondArrPalindrom(String word) {

        List<Character> secondArrWord = new ArrayList<>();

        for (int i = word.length() - 1; i >= 0; i--) {
            secondArrWord.add(word.charAt(i));
        }
        return secondArrWord;
    }

    public static boolean isPalindrom(String word) {

        if (createFistArrPalindrom(word).equals(createSecondArrPalindrom(word))) {
            return true;
        }
        return false;
    }


}