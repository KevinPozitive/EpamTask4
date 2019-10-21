package by.epam.unit04.aggr_and_comp.second_task.entity;

import java.util.List;
import java.util.Objects;

public class Text {
    private String title;
    private List<Sentence> listSentence;

    public Text(String title, List<Sentence> listSentence) {
        this.title = title;
        this.listSentence = listSentence;
    }
    public String getTitle() {
        return title;
    }
    public List<Sentence> getListSentence() {
        return listSentence;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,listSentence);
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null||getClass()!=obj.getClass()){
            return false;
        }
        Text text = (Text) obj;
        return Objects.equals(title,text.title) &&
                Objects.equals(listSentence,text.listSentence);
    }
    @Override
    public String toString() {
        return "Text { heading: " +
                title + " sentence list: " + listSentence;
    }
}
