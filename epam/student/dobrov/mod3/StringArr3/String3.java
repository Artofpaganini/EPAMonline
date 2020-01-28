package by.epam.student.dobrov.mod3.StringArr3;

import java.util.Scanner;

/*
В строке найти количество цифр.
 */
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        int counter = Solution.findQuantity(sentence);
        System.out.println(counter);


    }
}
