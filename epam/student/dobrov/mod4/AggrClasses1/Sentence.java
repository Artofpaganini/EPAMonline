package by.epam.student.dobrov.mod4.AggrClasses1;

import java.util.List;

/*
Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class Sentence {

    private List<Word> words;

    public Sentence(List<Word> words) {
        this.words = words;
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "words=" + words +
                '}';
    }

    public String getAllWords() {
        StringBuilder sb = new StringBuilder();

        for (Word i : words) {
            sb.append(i.getWord());
            sb.append(" ");
        }
        return sb.toString();
    }
}
