package by.epam.student.dobrov.mod3.ObjString9;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
 */
public class Solution {

    public static int upperCaseQuantity(String string) {
        int upperCounter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if ((int) string.charAt(i) >= 65 || (int) string.charAt(i) <= 90) {
                    if (Character.isUpperCase(string.charAt(i))) {
                        upperCounter++;
                    }
                }
            } else {
                continue;
            }
        }
        return upperCounter;
    }

    public static int lowerCaseQuantity(String string) {
        int lowerCounter = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                if ((int) string.charAt(i) >= 97 && (int) string.charAt(i) < 122) {
                    if (Character.isLowerCase(string.charAt(i))) {
                        lowerCounter++;
                    }
                }
            } else {
                continue;
            }

        }
        return lowerCounter;
    }
}
