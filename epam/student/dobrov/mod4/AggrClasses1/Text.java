package by.epam.student.dobrov.mod4.AggrClasses1;

import java.util.List;

/*
Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Text {

    private String title;
    private List<Sentence> sentences;

    public Text(String title, List<Sentence> sentences) {
        this.title = title;
        this.sentences = sentences;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String toString() {
        return String.format("Text{" +
                "title=" + title +
                ", sentences=" + sentences +
                '}');
    }

    public String attachText(String attachText) {
        StringBuilder sb = new StringBuilder();
        String string = " ";

        for (Sentence i : sentences) {
            sb.append(i);
        }
        sb.append(attachText);
        string = sb.toString();
        return string;

    }

    public String getText() {
        String text = null;
        StringBuilder sb = new StringBuilder();

        for (Sentence i : sentences) {
            sb.append(i.getAllWords());
        }
        text = sb.toString();
        return text;
    }

    public void getAppendText(List<Sentence> appendSentences) {
        StringBuilder sb = new StringBuilder();
        sb.append(getText());

        for (Sentence i : appendSentences) {
            sb.append(i.getAllWords());
        }
        String fulltext = sb.toString();
        System.out.println(fulltext);
    }

}
