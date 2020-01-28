package by.epam.student.dobrov.mod3.StringArr4;

/*
В строке найти количество чисел.
 */
public class Solution {

    public static int findQuantity(String sentence) {
        int counter = 0;
        boolean isNum = true;

        for (int i = 0; i < sentence.length(); i++) {
            char symbol = sentence.charAt(i);
            if (Character.isDigit(symbol) && isNum == true) {
                isNum = false;
                counter++;
            } else if (Character.isDigit(symbol) == false && isNum == false) {
                isNum = true;
            }
        }
        return counter;
    }


}
