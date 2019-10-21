package by.epam.unit04.aggr_and_comp.second_task.entity;

import java.util.List;
import java.util.Objects;

public class Sentence {
    List<Word> listWord;

    public Sentence(List<Word> listWord) {
        this.listWord = listWord;
    }
    public List<Word> getListWord() {
        return listWord;
    }

    @Override
    public int hashCode() {
        return Objects.hash(listWord);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||getClass()!=obj.getClass()){return false;}
        Sentence sentence = (Sentence) obj;
        return Objects.equals(listWord,sentence.listWord);
    }
    @Override
    public String toString() {
        return "Sentence { word list: " +
                listWord + " }";
    }
}
