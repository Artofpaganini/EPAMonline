package by.epam.student.dobrov.mod5.OOP1;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Directory {

    private String pathWay;

    public Directory(String pathWay) {
        this.pathWay = pathWay;
    }

    public String getPathWay() {
        return pathWay;
    }

    public void setPathWay(String pathWay) {
        this.pathWay = pathWay;
    }
}
