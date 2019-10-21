package by.epam.unit04.aggr_and_comp.second_task.entity;

import java.util.Objects;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }
    public String getWord() {
        return word;
    }

    @Override
    public int hashCode() {
        return Objects.hash(word);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||obj.getClass()!=getClass()){return false;}
        Word word = (Word) obj;
        return Objects.equals(word,word.word);
    }
    @Override
    public String toString() {
        return "Word { " + word + " }";
    }
}
