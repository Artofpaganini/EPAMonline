package by.epam.student.dobrov.mod3.ObjString2;
/*
В строке вставить после каждого символа 'a' символ 'b'.
 */
import java.util.Scanner;

public class ObjString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
       String word = Solution.addSymbolB(string);
        System.out.println(word);
    }
}
