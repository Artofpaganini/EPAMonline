package by.epam.student.dobrov.mod3.StringArr4;

import java.util.Scanner;

/*
В строке найти количество чисел.
 */
public class String4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        int counter = Solution.findQuantity(sentence);
        System.out.println(counter);
    }
}
