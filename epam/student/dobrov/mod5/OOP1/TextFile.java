package by.epam.student.dobrov.mod5.OOP1;

/*
Создать объект класса Текстовый файл, используя классы Файл, Директория.
Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class TextFile extends File {

    private String textFormat;
    private String mainText;


    public TextFile(Directory directory, String expansion, String name, String mainText) {
        super(directory, expansion, name);
        this.mainText = mainText;

    }

    public String getTextFormat() {
        return textFormat;
    }

    public void setTextFormat(String textFormat) {
        if (isTextFile()) {
            this.textFormat = textFormat;
        }
    }

    public String getMainText() {
        return mainText;
    }

    public String addText(String additionalText) {
        StringBuilder sb = new StringBuilder();

        sb.append(this.mainText);
        sb.append(additionalText);
        this.mainText = sb.toString();

        return mainText;
    }

    public String deleteText() {
        this.mainText = "";
        return mainText;
    }

    @Override
    public String toString() {
        return String.format("Формат преобразования - " + getTextFormat() + "\n" +
                "Основной текст - " + getMainText());
    }
}
