package by.epam.student.dobrov.mod5.OOP1;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class File {

    private Directory directory;
    private String expansion;
    private String name;

    public File(Directory directory, String expansion, String name) {
        this.directory = directory;
        this.expansion = expansion;
        this.name = name;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getExpansion() {
        return expansion;
    }

    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("Директория - " + directory.getPathWay() + "\n" +
                "Расширение файла - " + getExpansion() + "\n" +
                "Имя файла - " + getName());
    }

    public boolean isTextFile() {
        if (getExpansion().equalsIgnoreCase(".txt")) {
            return true;
        }
        return false;
    }

    public void createTextFile() {

        if (!isTextFile()) {
            System.out.println("Формат не является текстовым! " + "\n");

        } else {
            System.out.println("Файл создан в текстовом формате"  + "\n");
        }
    }
}
