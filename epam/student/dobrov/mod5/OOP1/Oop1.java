package by.epam.student.dobrov.mod5.OOP1;

import by.epam.student.dobrov.mod4.AggrClasses1.Text;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Oop1 {
    public static void main(String[] args) {

        Directory directory = new Directory("D:/somePathWay/SomeFile"); // директория

        File file = new File(directory, ".txt", "SomeName");
        file.createTextFile(); //создание файла
        file.setName("SomeName123"); // переименование
        System.out.println(file.toString());

        System.out.println();

        TextFile textFile = new TextFile(directory, ".txt", file.getName(), "12345");
        textFile.setTextFormat("utf-8");
        System.out.println(textFile.toString());// вывод содержимого на консоль
        textFile.addText("678910"); //доп  текст

        System.out.println(textFile.toString());

        textFile.deleteText();
        System.out.println(textFile.toString());

    }

}
