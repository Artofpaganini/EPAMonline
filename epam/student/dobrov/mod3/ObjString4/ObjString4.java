package by.epam.student.dobrov.mod3.ObjString4;

/*
С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class ObjString4 {
    public static void main(String[] args) {
        String string = "информатика";
        System.out.println("Было: " + string);
        System.out.println("Стало: " + Solution.changeString(string));
    }
}