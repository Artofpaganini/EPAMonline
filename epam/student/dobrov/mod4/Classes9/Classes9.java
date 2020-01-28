package by.epam.student.dobrov.mod4.Classes9;


import java.util.Arrays;

/*
Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Classes9 {
    public static void main(String args[]) {

        Book[] book = new Book[4];
        book[0] = new Book(111, "Qwerty1", "qwe1", "QWE", 1111, 111, 111.5, "paper");
        book[1] = new Book(222, "Qwerty2", "qwe2", "QWE1", 2222, 222, 222.5, "paper");
        book[2] = new Book(333, "Qwerty3", "qwe3", "QWE", 3333, 333, 333.5, "paper");
        book[3] = new Book(444, "Qwerty4", "qwe1", "QWE3", 3333, 333, 333.5, "paper");

        BookInfo bookInfo = new BookInfo(book);

        bookInfo.outPutInformation();

        System.out.println();

        Book[] arrayBook = bookInfo.booksByAuthor("qwe1");
        bookInfo.outPutInformation(arrayBook);

        System.out.println();

        arrayBook  = bookInfo.booksByProductionOfPublishing("QWE");
        bookInfo.outPutInformation(arrayBook);

        System.out.println();

        arrayBook = bookInfo.booksByYearOfPublishing(2222);
        bookInfo.outPutInformation(arrayBook);


    }
}

