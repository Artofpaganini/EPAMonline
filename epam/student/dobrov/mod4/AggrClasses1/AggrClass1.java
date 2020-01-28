package by.epam.student.dobrov.mod4.AggrClasses1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */
public class AggrClass1 {
    public static void main(String[] args) {

        Word words1 = new Word("Мама");
        Word words2 = new Word("мыла");
        Word words3 = new Word("раму");

        List<Word> words = new ArrayList<>();
        words.add(words1);
        words.add(words2);
        words.add(words3);

        Sentence sentence = new Sentence(words);
        List<Sentence> sentences = new ArrayList<>();
        sentences.add(sentence);

        Text text = new Text("Стандартное предложение", sentences);

        System.out.println(text.getTitle()); // заголовок
        System.out.println(text.getText());// вывести текст

        Word appendWord1 = new Word("Ничего");
        Word appendWord2= new Word("необычного");
        List  <Word> appendWords = new ArrayList<>();
        words.add(appendWord1);
        words.add(appendWord2);

        Sentence appendSentence = new Sentence(appendWords);
        List<Sentence>  appendSentences = new ArrayList<>();
        appendSentences.add(appendSentence); // дополнить текст

        text.getAppendText(appendSentences);
    }

}

