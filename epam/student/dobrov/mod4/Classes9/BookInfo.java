package by.epam.student.dobrov.mod4.Classes9;

import java.util.Arrays;

class BookInfo {
    private Book[] books;

    public BookInfo(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return String.format("BookInfo{" +
                "books=" + Arrays.toString(books) +
                '}');
    }

    //вывод на консоль
    public void outPutInformation() {
        for (int i = 0; i < this.books.length; i++) {
            System.out.println(books[i] + " ");

        }
    }

    public void outPutInformation(Book[] booksNew) {


        for (int i = 0; i < booksNew.length; i++) {

            System.out.println(booksNew[i]);
        }
    }

    //a) список книг заданного автора;

    public Book[] booksByAuthor(String author) {

        int counter = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (books[i].checkAuthor(author)) {
                counter++;
            }

        }
        Book[] booksNew = new Book[counter];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].checkAuthor(author)) {
                booksNew[j] = books[i];
                j++; //является переменной которая определяет шаг  booksNew  в массиве  books
            }

        }
        return booksNew;
    }
    // список книг, выпущенных заданным издательством;

    public Book[] booksByProductionOfPublishing(String productionOfPublishing) {

        int counter = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (books[i].checkProductionOfPublishing(productionOfPublishing)) {
                counter++;
            }

        }
        Book[] booksNew = new Book[counter];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].checkProductionOfPublishing(productionOfPublishing)) {
                booksNew[j] = books[i];
                j++; //является переменной которая определяет шаг  booksNew  в массиве  books
            }

        }
        return booksNew;
    }

    //список книг, выпущенных после заданного года.
    public Book[] booksByYearOfPublishing(int yearOfPublishing) {

        int counter = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (books[i].checkYearOfPublishing(yearOfPublishing)) {
                counter++;
            }

        }
        Book[] booksNew = new Book[counter];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (this.books[i].checkYearOfPublishing(yearOfPublishing)) {
                booksNew[j] = books[i];
                j++; //является переменной которая определяет шаг  booksNew  в массиве  books
            }

        }
        return booksNew;
    }
}
