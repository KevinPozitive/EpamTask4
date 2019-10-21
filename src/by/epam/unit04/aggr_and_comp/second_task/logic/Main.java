package by.epam.unit04.aggr_and_comp.second_task.logic;

import by.epam.unit04.aggr_and_comp.second_task.entity.Sentence;
import by.epam.unit04.aggr_and_comp.second_task.entity.Text;
import by.epam.unit04.aggr_and_comp.second_task.entity.Word;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("Word1");
        Word word2 = new Word("Word2");
        Word word3 = new Word("Word3");
        List<Word> wordList = new ArrayList<>();

        Word word4 = new Word("Word1");
        Word word5 = new Word("Word2");
        Word word6 = new Word("Word3");
        List<Word> wordList2 = new ArrayList<>();

        wordList.add(word1);
        wordList.add(word2);
        wordList.add(word3);

        wordList.add(word4);
        wordList.add(word5);
        wordList.add(word6);

        Sentence sentence = new Sentence(wordList);
        Sentence sentence2 = new Sentence(wordList);

        List<Sentence> sentenceList = new ArrayList<>();
        sentenceList.add(sentence);
        sentenceList.add(sentence2);

        Text text = new Text("Title",sentenceList);

        Action action = new Action();
        action.showText(text);
        action.addText(text,sentence);
        action.showText(text);
        action.showTitle(text);
    }
}
